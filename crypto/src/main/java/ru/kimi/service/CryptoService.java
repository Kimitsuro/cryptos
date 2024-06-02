//CryptoService.java
package ru.kimi.service;

import ru.kimi.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CryptoService {

    public List<Coin> getAllCoins() {
        // Hardcoded data for 5 cryptocurrencies
        List<Coin> coins = new ArrayList<>();
        coins.add(new Coin("Bitcoin", "BTC", 50000.0, -25.0, 23.0, 56.0, 2303534050432.0, 4395723867.0, Arrays.asList(324, 436, 584, 987, 674)));
        coins.add(new Coin("Ethereum", "ETH", 4000.0, -10.0, 15.0, 30.0, 500000000000.0, 2000000000.0, Arrays.asList(200, 300, 400, 500, 600)));
        coins.add(new Coin("Ripple", "XRP", 1.0, -5.0, 10.0, 20.0, 50000000000.0, 1000000000.0, Arrays.asList(1, 2, 3, 4, 5)));
        coins.add(new Coin("Litecoin", "LTC", 200.0, -8.0, 12.0, 25.0, 15000000000.0, 500000000.0, Arrays.asList(50, 60, 70, 80, 90)));
        coins.add(new Coin("Bitcoin Cash", "BCH", 600.0, -12.0, 18.0, 40.0, 10000000000.0, 300000000.0, Arrays.asList(10, 20, 30, 40, 50)));
        return coins;
    }

    public List<Trend> getTrends() {
        // Hardcoded trends
        List<Trend> trends = new ArrayList<>();
        trends.add(new Trend("Bitcoin", "BTC", 23.0));
        trends.add(new Trend("Ethereum", "ETH", 15.0));
        trends.add(new Trend("Ripple", "XRP", 10.0));
        trends.add(new Trend("Litecoin", "LTC", 12.0));
        trends.add(new Trend("Bitcoin Cash", "BCH", 18.0));
        return trends;
    }

    public List<Exchange> getExchanges() {
        // Hardcoded exchanges
        List<Exchange> exchanges = new ArrayList<>();
        exchanges.add(new Exchange("Binance", 9.0, 364578658725.0, 67, 45, Arrays.asList(324, 436, 584, 987, 674)));
        return exchanges;
    }

    public Portfolio getPortfolio() {
        // Hardcoded portfolio
        List<Coin> coins = new ArrayList<>();
        coins.add(new Coin("Bitcoin", "BTC", 50000.0, -25.0, 23.0, 56.0, 2303534050432.0, 4395723867.0, Arrays.asList(324, 436, 584, 987, 674)));

        List<Deal> deals = new ArrayList<>();
        deals.add(new Deal("2024-02-02T12:33:33", "sell", 3543256.0, 3.0, "Bitcoin", "BTC"));

        return new Portfolio(coins, deals, Arrays.asList(324.0, 436.0, 584.0, 987.0, 674.0), Arrays.asList(324.0, 436.0, 584.0, 987.0, 674.0), 345.0, 345.0);
    }

    public List<Deal> addDeal(Deal newDeal) {
        // This would normally involve saving to a database
        // For this example, we just return the deal in a list to simulate a response
        List<Deal> deals = new ArrayList<>();
        deals.add(newDeal);
        return deals;
    }
}