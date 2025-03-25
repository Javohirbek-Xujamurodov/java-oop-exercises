package danielLiangExercises.ex9_2;

public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.println("Stock: " + stock.name + " (" + stock.symbol + ")");
        System.out.println("Previous Closing Price: $" + stock.previousClosingPrice);
        System.out.println("Current Price: $" + stock.currentPrice);
        System.out.println("Price Change Percentage: " + stock.getChangePercent() + "%");

    }
}
