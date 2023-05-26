package com.BotHelper.BotHelper.service;

import com.BotHelper.BotHelper.WB.Goodz;
import com.BotHelper.BotHelper.WB.Instruments;
import com.BotHelper.BotHelper.config.BotConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.*;

import static com.BotHelper.BotHelper.WB.SelsDefault.salesPerDaily;

@Slf4j
@Component
public class TelegramBot extends TelegramLongPollingBot {
    public static final String TEXT_HELP =
            """
                    Этот бот создан для работы с ВБ\s
                    Вы можете использовать доступные Вам команды в боковом меню слева
                    Команда /start приветственное сообщение
                    Команда /stocksWBOOO остатки по конкретному артикулу
                    Команда /criticalStocks товары остаток которых меньше 14 дней
                    """;
    final BotConfig config;

    public TelegramBot(BotConfig config) {
        this.config = config;
    }

    @Override
    public String getBotUsername() {
        return config.getBotName();
    }

    @Override
    public String getBotToken() {
        return config.getBotToken();
    }

    Queue<String> updates = new LinkedList<>();

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            String text = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();


            if (!text.startsWith("/") && updates.contains("/stocksWBOOO")) {
                updates.add(text);
                sendMessage(chatId, "Текущая очередь: " + updates);
            } else if (text.equals("/start")) {
                startCommandReceived(chatId, update.getMessage().getChat().getFirstName());
            } else if (text.equals("/help")) {
                sendMessage(chatId, TEXT_HELP);
            } else if (text.equals("/stocksWBOOO")) {
                sendMessage(chatId, "Остатки каких товаров Вы хотите посмотреть?\n" +
                        "Введите начало артикула товара с большой буквы, через запитую, и в конце нажми /stop");
                updates.add("/stocksWBOOO");
            } else if (text.equals("/stop")) {
                updates.add("/stop");
                sendMessage(chatId, "Формируем список запрашиваемых артикулов");
                sendMessage(chatId, "Очередь содержит: " + updates.toString());

                List<String> articles = checkedQueue(updates);

                sendMessage(chatId, " Состав списка: " + articles);
                stocksWBOOO(chatId, articles);
            } else if (text.equals("/criticalStocks")) {
                criticalStocks(chatId);
            } else if (text.startsWith("/") && !text.equalsIgnoreCase("/start") && !text.equalsIgnoreCase("/help") && !text.equalsIgnoreCase("/stocksWBOOO") && !text.equalsIgnoreCase("/stocksWBOOO")) {
                sendMessage(chatId, "Команда не распознана, пожалуйста введите корректную команду.");
            }

        }

    }

    private void startCommandReceived(long chatId, String name) {
        String answer = "Привет, " + name + ", приятно познакомиться!";
        sendMessage(chatId, answer);
        log.info("Ответели пользователю на приветственное сообщение id: "+chatId+ " "+ name);

    }

    private List<String> checkedQueue(Queue<String> queue) {
        List<String> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            if (queue.peek().startsWith("/")) {
                queue.remove();
            } else {
                result.add(queue.poll());
            }
        }

        log.info("Очередь проверена");
        return result;
    }

    private void sendMessage(long chatId, String textToSend) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);
        try {
            execute(message);
            log.info("Сообщение пользователю через sendMessage вчат " + chatId + " отправленно");
        } catch (TelegramApiException e) {
            log.error("Error occurred" + e.getMessage());
        }
    }

    private void sendStocks(long chatId) {

        Instruments instrument = new Instruments();

        Set<Goodz> resultStock = instrument.stocksToDay();
        log.info("Остатки спарсены" + resultStock.size());

        List<String> result = instrument.actualDailyStocks(resultStock, salesPerDaily);

        StringBuilder sb = new StringBuilder();

        for (String line : result) {
            sb.append(line + "\n");
        }
        try {
            sendMessage(chatId, sb.toString());
        } catch (Exception e) {
            log.error("Error occurred" + e.getMessage());
        }
    }

    private void stocksWBOOO(long chatId, List<String> articls) {
        StringBuilder sb = new StringBuilder();
        Instruments instruments = new Instruments();

        Set<Goodz> result = instruments.stocksToDay();
        for (Goodz lineGoodz : result) {
            for (String line : articls) {
                if (lineGoodz.getSupplierArticle().startsWith(line)) {
                    sb.append(lineGoodz.getSupplierArticle()).append(", Текущий доступный остаток для продажи: ").append(lineGoodz.getQuantity()).append("\n");
                }
            }
        }
        try {
            if (sb.toString().isEmpty()) {
                sendMessage(chatId, " Сервер ВБ недоступен, не могу скачать остатки, попробуйте позже.");
                log.error("Проблема на стороне сервера ВБ"+" парсим нулевые остатки.");
            } else {
                sendMessage(chatId, sb.toString());
            }
        } catch (Exception e) {
            log.error("Error occurred" + e.getMessage());
        }

    }

    //    private boolean checkedCommand(String text){
//        List<String> commadns = Arrays.asList("/start","/help","/stocksWBOOO","/stocksWBOOO");
//        boolean result = ;
//
//        return result;
//    }
    private void criticalStocks(long chatId) {
        Instruments instrument = new Instruments();
        Set<Goodz> resultStock = instrument.stocksToDay();
        StringBuilder sb = new StringBuilder();
        for (Goodz lineStocks : resultStock) {
            for (Goodz lineSales : salesPerDaily) {

                if (lineStocks.getSupplierArticle().equals(lineSales.getSupplierArticle())) {

                    int tmpDailyStocks = (int) Math.round(lineStocks.getQuantity() / lineSales.getSalesPerDaily());

                    if (tmpDailyStocks < 14) {
                        sb.append(lineStocks.getSupplierArticle() + ", остаток: " + lineStocks.getQuantity() + " хватит на: " + tmpDailyStocks + ".");
                        sb.append("\n");
                    }
                }
            }
        }
        String result = sb.toString();
        if (sb.toString().isEmpty())
            log.error("Проблема на стороне сервера ВБ"+" парсим нулевые остатки.");
            result = "Пустой ответ от сервера ВБ \n" + "Возможно стоит попробовать позже.";
        try {
            sendMessage(chatId, result);
        } catch (Exception e) {
            log.error("Error occurred" + e.getMessage());
        }
    }

}
