import java.util.*;

public class Stock {
    int id;
    int timeStamp;
    String stockName;
    BuyOrSell buyOrSell;
    int quantity;
    double pricePerUnit;
    static List<Stock> stockList = new ArrayList<Stock>();

    public Stock(int id, int timeStamp, String stockName, BuyOrSell buyOrSell, int quantity, double pricePerUnit) {
        this.id = id;
        this.timeStamp = timeStamp;
        this.stockName = stockName;
        this.buyOrSell = buyOrSell;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        stockList.add(this);
    }

}
