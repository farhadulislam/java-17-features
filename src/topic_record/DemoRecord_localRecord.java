package topic_record;

import java.util.List;

public class DemoRecord_localRecord {

    private static int getPrice(String ticker) {
        return (int) (Math.random() * 1000);
    }

    public static void main(String[] args) {
        record Stock(String ticker, int price) {

            //toString can be overridden
        }
        List<String> tickers = List.of("AMZN", "GOOG", "ORCL");
        tickers.stream()
                //.map(DemoRecord_localRecord::getPrice)
                .map(ticker -> new Stock(ticker, getPrice(ticker)))
                .forEach(System.out::println);

    }
}
