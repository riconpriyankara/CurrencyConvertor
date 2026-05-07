import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CurrencyConverterTest {

    @Test
    public void testINRtoUSD() {

        double result =
                CurrencyConverter.convertINRtoUSD(1000);

        assertEquals(12.0, result, 0.01);
    }

    @Test
    public void testUSDtoINR() {

        double result =
                CurrencyConverter.convertUSDtoINR(100);

        assertEquals(8300.0, result, 0.01);
    }
}