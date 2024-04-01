package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;


    }

    public long avgSales(long[] sales) {
        long sum = sumSales(sales);
        return sum / sales.length;

    }


    public int minMonthSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxMonthSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int salesBelowAvg(long[] sales) {
        long avg = avgSales(sales);
        long months = 0;
        for (long sale : sales) {
            if (sale < avg) {
                months++;
            }
        }
        return (int) months;
    }

    public int salesAboveAvg(long[] sales) {
        long avg = avgSales(sales);
        int months = 0;
        for (long sale : sales) {
            if (sale > avg) {
                months++;
            }
        }
        return months;
    }
}
