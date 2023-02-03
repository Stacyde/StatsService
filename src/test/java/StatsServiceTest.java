import ru.netology.stats.StatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void minMonth() {
        StatsService service = new StatsService();
        long[] sale = {144, 44, 44, 66, 15, 444, 333, 66};
        int expectedMonth = 5;
        long actualMonth = service.minSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void maxMonth() {
        StatsService service = new StatsService();
        long[] sale = {123, 556, 234, 33, 22, 5454, 455};
        int expectedMonth = 6;
        long actualMonth = service.maxSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void sumSales() {
        StatsService service = new StatsService();
        long[] sale = {123, 44, 234, 33, 55, 5454, 32};
        int expectedMonth = 5975;
        long actualMonth = service.sumSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void averageSumSales() {
        StatsService service = new StatsService();
        long[] sale = {123, 44, 234, 33, 55, 5454, 32};
        int expectedMonth = 853;
        long actualMonth = service.averageSumSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void belowAverageSales() {
        StatsService service = new StatsService();
        long[] sale = {123, 44, 234, 33, 55, 5454, 32};
        int expectedMonth = 6;
        long actualMonth = service.belowAverageSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void aboveAverageSales() {
        StatsService service = new StatsService();
        long[] sale = {123, 44, 234, 33, 55, 5454, 32};
        int expectedMonth = 1;
        long actualMonth = service.aboveAverageSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

}
