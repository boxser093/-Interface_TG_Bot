package com.BotHelper.BotHelper.WB;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;

public class Instruments {

    public Set<Goodz> stocksToDay() {
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        try {
            final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2Nlc3NJRCI6IjAyNTMxNTA5LWZiYTItNDdkNy1hNTI1LTllNTA5YjQ5YzUxMiJ9.KmzC5UkSygn1xSHOFxywKvIxbmeSp9ap6CGsVX78WVc";
            String dateToDay = simpleDateFormat2.format(new Date()).toString();
            String urlStr = "https://statistics-api.wildberries.ru/api/v1/supplier/stocks?dateFrom="+dateToDay+"&key=" + token;
            URL url = new URL(urlStr);
            final HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Authorization", token);
            con.setConnectTimeout(5000);
            con.setReadTimeout(4000);


            final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;

            final StringBuilder stringBuilder = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
            ObjectMapper mapper = new ObjectMapper();
            StringReader reader = new StringReader(stringBuilder.toString());
            String s = stringBuilder.toString().substring(stringBuilder.toString().lastIndexOf("["));

            Goodz[] result = mapper.readValue(s, Goodz[].class);
            List<Goodz> avalibality = Arrays.asList(result);
            sumEsli(avalibality);

            return sumEsli(avalibality);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Set<Goodz> sumEsli(List<Goodz> list) {
        Set<Goodz> result = new HashSet<>();
        //копируем массив в список;
        for (Goodz line : list) {
            result.add(new Goodz(line.getSupplierArticle().trim(), 0));
        }
        // проверяем похожи ли артикулы, если похожи, то складываем остатки все остатки по каждому артикулу.
        for (Goodz line : result) {
            for (Goodz line2 : list) {
                if (line.getSupplierArticle().equals(line2.getSupplierArticle().trim())) {
                    line.setQuantity(line.getQuantity() + line2.getQuantity());
                    line.setQuantityFull(line.getQuantityFull() + line2.getQuantityFull());
                }
            }
        }
        return result;
    }

    public void printArrayWithPattern(Set<Goodz> list) {

        List<String> patterns = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            System.out.println("Введите первые буквы запрашиваемой группы артикулов и нажмите Enter. \nПосле того, как закончите введите команду '/stop' без ковычек и нажмите Enter.");
            while ((input = br.readLine()) != null) {
                if (input.equals("/stop")) break;
                patterns.add(input);
            }
            for (String pattern : patterns) {
                for (Goodz line : list) {
                    if (line.getSupplierArticle().contains(pattern)) {
                        System.out.println(line.getSupplierArticle() + " остаток доступный к продаже: " + line.getQuantity() + " на всех складах: " + line.getQuantityFull());
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void postHttpRequest(String urlStr, String token) {

        try {
            URL url = new URL(urlStr);
            final HttpURLConnection con = (HttpURLConnection) url.openConnection();
            final String tokenApi = token;
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Authorization", tokenApi);
            con.setConnectTimeout(5000);
            con.setReadTimeout(4000);

            final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            final StringBuilder stringBuilder = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
            System.out.println(stringBuilder.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<DataFromTheProfitReport> getFinancialAnualRequest(String urlStr) {
        List<DataFromTheProfitReport> reports;
        try {
            final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2Nlc3NJRCI6IjAyNTMxNTA5LWZiYTItNDdkNy1hNTI1LTllNTA5YjQ5YzUxMiJ9.KmzC5UkSygn1xSHOFxywKvIxbmeSp9ap6CGsVX78WVc";

            URL url = new URL(urlStr);
            final HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Authorization", token);
            con.setConnectTimeout(5000);
            con.setReadTimeout(4000);


            final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;

            final StringBuilder stringBuilder = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
            ObjectMapper mapper = new ObjectMapper();
            StringReader reader = new StringReader(stringBuilder.toString());
            String s = stringBuilder.toString().substring(stringBuilder.toString().lastIndexOf("["));

            DataFromTheProfitReport[] result = mapper.readValue(s, DataFromTheProfitReport[].class);
            reports = Arrays.asList(result);

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return reports;
    }

    public List<String> actualDailyStocks(Set<Goodz> goodzStocks, Set<Goodz> selsPerDaily) {
        List<String> result = new ArrayList<>();
        for(Goodz lineStocks: goodzStocks){
            for (Goodz lineSales: selsPerDaily){

                if(lineStocks.getSupplierArticle().equals(lineSales.getSupplierArticle())){

                    int tmpDailyStocks =(int) Math.round(lineStocks.getQuantity()/lineSales.getSalesPerDaily());

                    if(tmpDailyStocks<14){
                        result.add(lineStocks.getSupplierArticle()+", остаток: "+ lineStocks.getQuantity()+" хватит на: "+ tmpDailyStocks);
                    }
                }
            }
        }
        Collections.sort(result);
        return result;
    }

}

