//PortfolioDto.java
package ru.kimi.dto;

import lombok.Data;
import java.util.List;

@Data
public class PortfolioDto {
    private List<CoinDto> coins;
    private List<DealDto> deals;
    private List<Double> profile_volume_usd;
    private List<Double> profile_volume_btc;
    private double current_volume_usd;
    private double current_volume_btc;
}