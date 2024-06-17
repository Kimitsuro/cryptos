//Coin.java
package ru.kimi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Coin {
    @Id
    private Long id;
    private String coin_name;
    private String coin_code;
    private double price;
    private double hour1;
    private double hour24;
    private double day7;
    private double market_cap;
    private double volume;
    private List<Integer> last_price;

    public Coin(String coin_name, String coin_code, double price, double hour1, double hour24, double day7, double market_cap, double volume, List<Integer> last_price) {
        this.coin_name = coin_name;
        this.coin_code = coin_code;
        this.price = price;
        this.hour1 = hour1;
        this.hour24 = hour24;
        this.day7 = day7;
        this.market_cap = market_cap;
        this.volume = volume;
        this.last_price = last_price;
    }
}