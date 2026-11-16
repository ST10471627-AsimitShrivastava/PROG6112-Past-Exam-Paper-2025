
package productsales;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductSalesTest {

    // I create an object to test the product sales methods.
    private ProductSales productSales;

    // I prepare a fresh object before each test.
    @Before
    public void setUp() {
        productSales = new ProductSales();
    }

    // I test whether the correct number of sales are over the limit.
    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {

        // I set the expected number of sales over 500.
        int expected = 2;

        // I get the actual number of sales over 500.
        int actual = productSales.GetSalesOverLimit();

        // I check whether the expected and actual values match.
        assertEquals(expected, actual);
    }

    // I test whether the correct number of sales are under the limit.
    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {

        // I set the expected number of sales under 500.
        int expected = 4;

        // I get the actual number of sales under 500.
        int actual = productSales.GetSalesUnderLimit();

        // I check whether the expected and actual values match.
        assertEquals(expected, actual);
    }
}
