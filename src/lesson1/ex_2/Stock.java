package lesson1.ex_2;

public class Stock {
    String symbol;
    String name ;
    double previousClosingPrice;
    double currentPrice;

    Stock ( String symbol , String name){
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercent(){
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
