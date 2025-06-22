import observer.MobileApp;
import observer.WebApp;
import subject.StockMarket;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        MobileApp mobile1 = new MobileApp("Alice");
        WebApp web1 = new WebApp("Bob");

        market.registerObserver(mobile1);
        market.registerObserver(web1);

        market.setStockData("TCS", 3750.25);
        market.setStockData("INFY", 1465.75);
    }
}
