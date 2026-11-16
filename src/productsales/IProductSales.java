
package productsales;

public interface IProductSales {

    // I get the product sales information.
    int[][] GetProductSales();

    // I get the total sales.
    int GetTotalSales();

    // I get the number of sales over the limit.
    int GetSalesOverLimit();

    // I get the number of sales under the limit.
    int GetSalesUnderLimit();

    // I get the number of years processed.
    int GetProductsProcessed();

    // I get the average sales.
    double GetAverageSales();
}
