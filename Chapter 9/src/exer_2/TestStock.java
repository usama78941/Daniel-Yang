package exer_2;

public class TestStock {
    public static void main(String[] args){
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setCurrentPrice(34.35);
        stock.setPreviousClosingPrice(34.5);
        System.out.printf("the change in percentage of price of stock named " + stock.name + " with the " +
                        "symbol " + stock.symbol + " is: %1.3f", stock.getChangePercentage());
    }
}
