//CoinDto.java
package ru.kimi.dto;

import lombok.Data;
import java.util.List;

@Data
public class CoinDto {
    private String coin_name;
    private String coin_code;
    private double price;
    private double hour1;
    private double hour24;
    private double day7;
    private double market_cap;
    private double volume;
    private List<Integer> last_price;
}