package ru.kimi;

import ru.kimi.model.*;
import ru.kimi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private CoinRepository coinRepository;

    @Autowired
    private TrendRepository trendRepository;

    @Autowired
    private ExchangeRepository exchangeRepository;

    @Autowired
    private DealRepository dealRepository;

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Override
    public void run(String... args) throws Exception {
        // Initialize coins
        Coin bitcoin = new Coin("Bitcoin", "BTC", 50000.0, -25.0, 23.0, 56.0, 2303534050432.0, 4395723867.0, Arrays.asList(324, 436, 584, 987, 674));
        Coin ethereum = new Coin("Ethereum", "ETH", 4000.0, -10.0, 15.0, 30.0, 500000000000.0, 2000000000.0, Arrays.asList(200, 300, 400, 500, 600));
        Coin ripple = new Coin("Ripple", "XRP", 1.0, -5.0, 10.0, 20.0, 50000000000.0, 1000000000.0, Arrays.asList(1, 2, 3, 4, 5));
        coinRepository.saveAll(Arrays.asList(bitcoin, ethereum, ripple));

        // Initialize trends
        Trend trend1 = new Trend("Bitcoin", "BTC", 23.0);
        Trend trend2 = new Trend("Ethereum", "ETH", 15.0);
        trendRepository.saveAll(Arrays.asList(trend1, trend2));

        // Initialize exchanges
        Exchange binance = new Exchange("Binance", 9.0, 364578658725.0, 67, 45, Arrays.asList(324, 436, 584, 987, 674));
        exchangeRepository.save(binance);

        // Initialize deals
        Deal deal = new Deal("2024-02-02T12:33:33", "sell", 3543256.0, 3.0, "Bitcoin", "BTC");
        dealRepository.save(deal);

        // Initialize portfolio
        Portfolio portfolio = new Portfolio(Arrays.asList(bitcoin), Arrays.asList(deal), Arrays.asList(324.0, 436.0, 584.0, 987.0, 674.0), Arrays.asList(324.0, 436.0, 584.0, 987.0, 674.0), 345.0, 345.0);
        portfolioRepository.save(portfolio);
    }
}
