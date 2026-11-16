
package productsales;

public class ProductSales implements IProductSales {

    // I set the sales limit to 500.
    private static final int SALES_LIMIT = 500;

    // I store the names of the three products.
    private final String[] products = {
        "Microphone",
        "Speakers",
        "Mixing Desk"
    };

    // I store the sales for the two years.
    private final int[][] productSales = {
        {300, 150, 700},
        {250, 200, 600}
    };

    // I return the product sales information.
    @Override
    public int[][] GetProductSales() {

        // I create a copy so the original data cannot be changed.
        int[][] salesCopy = new int[productSales.length][];

        for (int i = 0; i < productSales.length; i++) {
            salesCopy[i] = productSales[i].clone();
        }

        return salesCopy;
    }

    // I calculate the total product sales.
    @Override
    public int GetTotalSales() {

        int total = 0;

        // I go through every year and add the sales.
        for (int[] year : productSales) {
            for (int sale : year) {
                total += sale;
            }
        }

        return total;
    }

    // I count the sales that are over 500.
    @Override
    public int GetSalesOverLimit() {

        int count = 0;

        // I count every sale greater than the limit.
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale > SALES_LIMIT) {
                    count++;
                }
            }
        }

        return count;
    }

    // I count the sales that are under 500.
    @Override
    public int GetSalesUnderLimit() {

        int count = 0;

        // I count every sale less than the limit.
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale < SALES_LIMIT) {
                    count++;
                }
            }
        }

        return count;
    }

    // I return the number of years processed.
    @Override
    public int GetProductsProcessed() {
        return productSales.length;
    }

    // I calculate the average product sales.
    @Override
    public double GetAverageSales() {

        int numberOfSales = 0;

        // I count how many individual sales entries there are.
        for (int[] year : productSales) {
            numberOfSales += year.length;
        }

        // I check that there are sales to calculate.
        if (numberOfSales == 0) {
            return 0;
        }

        return (double) GetTotalSales() / numberOfSales;
    }
}
