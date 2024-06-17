//Exchange.java
package ru.kimi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Exchange {
    @Id
    private Long id;
    private String name;
    private double score;
    private double volume24h;
    private int markets;
    private int coins;
    private List<Integer> last_volume;

    public Exchange(String name, double score, double volume24h, int markets, int coins, List<Integer> last_volume) {
        this.name = name;
        this.score = score;
        this.volume24h = volume24h;
        this.markets = markets;
        this.coins = coins;
        this.last_volume = last_volume;
    }
}