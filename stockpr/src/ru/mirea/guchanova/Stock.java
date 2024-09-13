package ru.mirea.guchanova;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String name, String symbol, double previousClosingPrice, double currentPrice) {
        this.name = name;
        this.symbol = symbol;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }
    double getChangePercent(){
        return ((currentPrice - previousClosingPrice)/previousClosingPrice)*100;
    }
}
