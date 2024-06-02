//Portfolio.java
package ru.kimi.model;

import lombok.Data;
import java.util.List;

@Data
public class Portfolio {
    private List<Coin> coins;
    private List<Deal> deals;
    private List<Double> profile_volume_usd;
    private List<Double> profile_volume_btc;
    private double current_volume_usd;
    private double current_volume_btc;

    public Portfolio(List<Coin> coins, List<Deal> deals, List<Double> profile_volume_usd, List<Double> profile_volume_btc, double current_volume_usd, double current_volume_btc) {
        this.coins = coins;
        this.deals = deals;
        this.profile_volume_usd = profile_volume_usd;
        this.profile_volume_btc = profile_volume_btc;
        this.current_volume_usd = current_volume_usd;
        this.current_volume_btc = current_volume_btc;
    }
}