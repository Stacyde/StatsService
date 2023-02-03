package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
    public int maxSales(long[] sales){
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales){
            if (sale >= sales[maxMonth]){
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public int sumSales(long[] sales){
        int sumSales = 0;
        for (long sale : sales){
            sumSales += sale;
        }
        return sumSales;
    }
    public int averageSumSales(long[]sales){
        int averageSum = sumSales(sales)/sales.length;
        return averageSum;
    }
    public int belowAverageSales(long[]sales){
        int month = 0;
        for(long sale : sales){
            if (sale < averageSumSales(sales)){
                month +=1;
            }
        }
        return month;
    }
    public int aboveAverageSales(long[]sales){
        int month = 0;
        for(long sale : sales){
            if (sale > averageSumSales(sales)){
                month +=1;
            }
        }
        return month;
    }


}
