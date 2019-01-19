import java.util.ArrayList;
import java.util.List;
import java.util.Map;
package stock;
public class StockSystem {
    private Map<String, StockInfo> stockInfoMap = new HashMap<>();

    public void sellStock(String name, Float ppu, Float quantity, String time) {
        StockInfo stockInfo = stockInfoMap.get(name);
        if (stockInfo == null) {
            stockInfo = new StockInfo();
        }
        stockInfo.getAvailableStocks().add(new AvailableStock(ppu, quantity, time));
    }

    public void buyStock(String name, Float ppu, Float quantity, String time) {
        StockInfo stockInfo = stockInfoMap.get(name);
        if (stockInfo == null) {
            System.out.println("No such stock by name exists");
        }

        List<AvailableStock> availableStocks = stockInfo.getAvailableStocks();
        if (availableStocks.size() == 0) {
            System.out.println("No stocks left to full-fill the order");
        }

        // First fetch stocks satisfying the time range
        List<AvailableStock> filterStocks = filterStocksByTime(time, availableStocks);

        // Sort the stock by price per unit
        Collections.sort(filterStocks);

        // Start from the lowest available
    }

    private List<AvailableStock> filterStocksByTime(String time, List<AvailableStock> stocks) {
        return stocks.stream()                // convert list to stream
                .filter(stock -> (stock.time.compareTo(time) == 0) || stock.time.compareTo(time) == -1)
                .collect(Collectors.toList());
    }
}

}
