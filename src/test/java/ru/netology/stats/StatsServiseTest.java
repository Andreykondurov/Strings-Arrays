package ru.netology.stats;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class StatsServiceTest {
    @Test
    public void sumSalesTest() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void avgSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.avgSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minMonthSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minMonthSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void maxMonthSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxMonthSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void salesBelowAvgTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedBelowAvg = 5;
        long actualBelowAvg = service.salesBelowAvg(sales);

        Assertions.assertEquals(expectedBelowAvg, actualBelowAvg);


    }

    @Test
    public void salesAboveAvgTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAboveAvg = 5;
        long actualAboveAvg = service.salesBelowAvg(sales);

        Assertions.assertEquals(expectedAboveAvg, actualAboveAvg);
    }
}
