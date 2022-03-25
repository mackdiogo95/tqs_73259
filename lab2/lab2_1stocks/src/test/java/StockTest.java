import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StockTest {

    @Mock
    private IStockmarketService iStocksMarket;
    @InjectMocks
    private StocksPortfolio portfolio;

    @Test
    public void getTotalValue() {

        int result = 0 ;

        when(iStocksMarket.lookupPrice("AAPL")).thenReturn(2.0);
        when(iStocksMarket.lookupPrice("GOOGL")).thenReturn(5.0);

        portfolio.setMarketService(iStocksMarket);

        portfolio.addStock(new Stock("AAPL", 2));
        portfolio.addStock(new Stock("GOOGL", 5));

        result += iStocksMarket.lookupPrice("AAPL");
        result += iStocksMarket.lookupPrice("GOOGL");

        assert result == portfolio.getTotalValue();


    }
}


