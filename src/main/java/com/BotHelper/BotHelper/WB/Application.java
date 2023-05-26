package com.BotHelper.BotHelper.WB;


public class Application {

    public String getUrl() {
        return url;
    }

    public String getUrlSingleUser() {
        return urlSingleUser;
    }

    public String getToken() {
        return token;
    }

    public String getWbSklad() {
        return wbSklad;
    }

    public String getWbSkladvol2() {
        return wbSkladvol2;
    }

    public String getFinancialRequest() {
        return financialRequest;
    }

    final String url = "https://reqres.in/api/users?page=2";
        final String urlSingleUser = "https://reqres.in/api/users/2";
        final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2Nlc3NJRCI6IjAyNTMxNTA5LWZiYTItNDdkNy1hNTI1LTllNTA5YjQ5YzUxMiJ9.KmzC5UkSygn1xSHOFxywKvIxbmeSp9ap6CGsVX78WVc";
        final String wbSklad = "https://statistics-api.wildberries.ru/api/v2.1/supplier/incomes";
        final String wbSkladvol2 = "https://statistics-api.wildberries.ru/api/v1/supplier/stocks?dateFrom=2023-04-14&key=" + token;
        final String financialRequest = "https://statistics-api.wildberries.ru/api/v1/supplier/reportDetailByPeriod?dateFrom=2023-01-20&dateTo=2023-04-12&rrdid=0&key=" + token;

        /*https://statistics-api.wildberries.ru/api/v1/supplier/reportDetailByPeriod?dateFrom=2022-12-05&dateTo=2022-12-11&rrdid=0&limit=100000
         */



//        instrument.printArrayWithPattern(instrument.getHttpRequestWBvol2(wbSkladvol2));

//        List<DataFromTheProfitReport> list = instrument.getFinancialAnualRequest(financialRequest);
//        for (DataFromTheProfitReport line : list) {
//            System.out.println(line.getSubject_name() + " " + line.getNm_id() + " " + line.getQuantity());
//        }
}
/**
 * 1. Парсим список остатков
 * 2. Парсим список продаж товаров за период 90 дней.
 * 3. Рассчитываем количество продаж в день шт/день.
 * 4. Рассчитываем на количество дней хватит тикущих остатков.
 * 5. Отправляем мессендж пользователю если тикущих остатков хватит меньше чем на 'n' дней.
 * <p>
 * 1. Учимся парсить отчет от фин результатах
 * 2. Считаем коилчество проданной продукции и сверяемся с exel файлом.
 * 3. Формируем список товаров (артикул_поставщика, продано за 90 дней, продано за 1 день шт).
 * 4. Пишем метод, котрый проводит вычисление путём диления текущих_остатков/продажи шт/день.
 * 4.1 Если результат меньше 14 дней, отправляем мессендж пользователю.
 * 5.1 Зациклить (ебануть отдельным потоком от основных запросов).
 * <p>
 * 1. Учимся парсить отчет от фин результатах
 * 2. Считаем коилчество проданной продукции и сверяемся с exel файлом.
 * 3. Формируем список товаров (артикул_поставщика, продано за 90 дней, продано за 1 день шт).
 * 4. Пишем метод, котрый проводит вычисление путём диления текущих_остатков/продажи шт/день.
 * 4.1 Если результат меньше 14 дней, отправляем мессендж пользователю.
 * 5.1 Зациклить (ебануть отдельным потоком от основных запросов).
 * <p>
 * 1. Учимся парсить отчет от фин результатах
 * 2. Считаем коилчество проданной продукции и сверяемся с exel файлом.
 * 3. Формируем список товаров (артикул_поставщика, продано за 90 дней, продано за 1 день шт).
 * 4. Пишем метод, котрый проводит вычисление путём диления текущих_остатков/продажи шт/день.
 * 4.1 Если результат меньше 14 дней, отправляем мессендж пользователю.
 * 5.1 Зациклить (ебануть отдельным потоком от основных запросов).
 */

//2147483647
//10596759193

/**
 * 1. Учимся парсить отчет от фин результатах
 * 2. Считаем коилчество проданной продукции и сверяемся с exel файлом.
 * 3. Формируем список товаров (артикул_поставщика, продано за 90 дней, продано за 1 день шт).
 * 4. Пишем метод, котрый проводит вычисление путём диления текущих_остатков/продажи шт/день.
 * 4.1 Если результат меньше 14 дней, отправляем мессендж пользователю.
 * 5.1 Зациклить (ебануть отдельным потоком от основных запросов).
 */
