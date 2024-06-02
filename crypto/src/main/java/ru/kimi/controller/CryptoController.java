//CryptoController.java
package ru.kimi.controller;

import ru.kimi.dto.DealDto;
import ru.kimi.model.*;
import ru.kimi.service.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@RestController
public class CryptoController {

    @Autowired
    private CryptoService cryptoService;

    @GetMapping("/coins")
    public List<Coin> getCoins() {
        return cryptoService.getAllCoins();
    }

    @GetMapping("/trends")
    public List<Trend> getTrends() {
        return cryptoService.getTrends();
    }

    @GetMapping("/exchanges")
    public List<Exchange> getExchanges() {
        return cryptoService.getExchanges();
    }

    @GetMapping("/portfolio")
    public Portfolio getPortfolio() {
        return cryptoService.getPortfolio();
    }

    @PostMapping("/add-deal")
    public List<Deal> addDeal(@RequestBody DealDto dealDto) {
        Deal newDeal = new Deal(dealDto.getDate(), dealDto.getType(), dealDto.getPrice(), dealDto.getVolume(), dealDto.getCoin_name(), dealDto.getCoin_code());
        return cryptoService.addDeal(newDeal);
    }
}