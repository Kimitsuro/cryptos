package ru.kimi.controller;

import ru.kimi.model.*;
import ru.kimi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;

@Controller
public class Cron_Task_Controller {
    @Autowired
    private Price_History_Repository price_history_repository;

    @GetMapping("/coins-prices")
    @ResponseBody
    public Iterable<Price_History> GET_Coins_Prices() {
        Iterable<Price_History> prices = price_history_repository.findAll();
        return prices;
    }

    @GetMapping("/current-price")
    @ResponseBody
    public Price_History GET_Current_Price() {
        RestTemplate rest_template = new RestTemplate();
        String url = "https://api.coindesk.com/v1/bpi/currentprice.json";
        JsonNode json = rest_template.getForObject(url, JsonNode.class);

        Float price = json.path("bpi").path("USD").path("rate_float").floatValue();
        String time = json.path("time").path("updated").asText();
        Boolean status = true;

        if (price == 0.0f || time.isEmpty()) {
            status = false;
        }

        if (price_history_repository.count() == 10) {
            Iterable<Price_History> prices = price_history_repository.findAll();
            Iterator<Price_History> iterator = prices.iterator();
            Price_History old_prices = iterator.next();
            price_history_repository.deleteById(old_prices.getId());
        }

        Price_History PRICE = new Price_History(price, time, status);
        price_history_repository.save(PRICE);
        return PRICE;
    }
}