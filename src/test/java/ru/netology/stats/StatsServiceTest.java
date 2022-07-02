package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    //1.Расчет суммы всех продаж
    @Test
    public void shouldCalculateSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.summaSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
        //System.out.println(actualSum);

    }


    //2.Расчет средней суммы продаж в месяц
    @Test
    public void shouldCalculateAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSale = 15;
        int actualSale = service.averageSaleCalculation(sales);
        Assertions.assertEquals(expectedSale, actualSale);
        System.out.println(actualSale);
    }


    //3.Расчет номера месяца с пиком продаж
    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 8;
        int actualDay = service.maxSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }


    //4. Расчет номера месяца с минимумом продаж
    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 9;
        int actualDay = service.minSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    //5.Расчет кол-ва месяцев, в которых продажи были ниже среднего
    @Test
    public void shouldFindSalesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumber = 5;
        int actualNumber = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    //5.Расчет кол-ва месяцев, в которых продажи были ниже среднего
    @Test
    public void shouldFindSalesAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumber = 5;
        int actualNumber = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }




}
