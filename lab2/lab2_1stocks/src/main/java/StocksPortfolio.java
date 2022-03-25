import java.util.ArrayList;


public class StocksPortfolio {


    ArrayList<Stock> stocks = new ArrayList<>();
    IStockmarketService stockMarket;

    StocksPortfolio(IStockmarketService stockMarket) {
        this.stockMarket = stockMarket;
    }


    void addStock(Stock s) {
        stocks.add(s);
    }

    double getTotalValue() {
        double totalValue = 0;
        double value = 0;
        int times = 1;
        for (Stock stock : stocks) {

            value = stockMarket.lookupPrice(stock.label);
            times = stock.quantity;
            totalValue += (value * times);
        }
        return totalValue;
    }

    public void setMarketService(IStockmarketService iStocksMarket) {
        this.stockMarket = iStocksMarket;
    }
}
