package exer_2;

public class Stock {
    String symbol;
    String name;
    double previousClosingPricee;
    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public void setCurrentPrice(double currentPrice){
        this.previousClosingPricee = this.currentPrice;
        this.currentPrice = currentPrice;
    }

    public void setPreviousClosingPrice(double previous){
        this.previousClosingPricee = previous;
    }

    public double getChangePercentage() {
        return ((currentPrice - previousClosingPricee) / currentPrice) * 100;
    }
}
