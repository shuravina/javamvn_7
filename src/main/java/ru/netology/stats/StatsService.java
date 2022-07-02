package ru.netology.stats;

public class StatsService {

    //1. Расчет суммы всех продаж
    public int summaSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];

        }
        return sum;

    }

    //2. Расчет средней суммы продаж в месяц

    public int averageSaleCalculation(long[] sales) {
        int averageSale = summaSales(sales) / sales.length;
        return averageSale;


    }


    //3. Расчет номера месяца с пиком продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }


    //4. Расчет номера месяца с минимумом продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;

    }

    //5.Расчет кол-ва месяцев, в которых продажи были ниже среднего
    public int salesBelowAverage(long[] sales) {
        int averageSale = averageSaleCalculation(sales);
        int amountMonth = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                amountMonth++;
            }
        }
        return amountMonth;
    }

    //6.Расчет кол-ва месяцев, в которых продажи были выше среднего
    public int salesAboveAverage(long[] sales) {
        int averageSale = averageSaleCalculation(sales);
        int amountMonth = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                amountMonth++;
            }
        }
        return amountMonth;
    }


}

