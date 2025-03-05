package task2;

public class Task2 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.println("Stock: " + stock.symbol + " - " + stock.name);
        System.out.println("Previous Price: " + stock.previousClosingPrice);
        System.out.println("Current Price: " + stock.currentPrice);
        System.out.println("Price Change Percentage: " + stock.getChangePercent() + "%");
    }
}
