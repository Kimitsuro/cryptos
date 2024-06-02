//CryptoService.java
package ru.kimi.service;

import ru.kimi.model.*;
import ru.kimi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CryptoService {
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
    public List<Coin> getAllCoins() {
        return coinRepository.findAll();
    }

    public List<Trend> getTrends() {
        return trendRepository.findAll();
    }

    public List<Exchange> getExchanges() {
        return exchangeRepository.findAll();
    }

    public Portfolio getPortfolio() {
        return portfolioRepository.findById(1L).orElse(null);
    }

    public List<Deal> addDeal(Deal newDeal) {
        dealRepository.save(newDeal);
        return dealRepository.findAll();
    }
}