//Exchange.java
package ru.kimi.model;

import lombok.Data;
import java.util.List;
import jakarta.persistence.*;

@Data
@Entity
public class Exchange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double score;
    private double volume24h;
    private int markets;
    private int coins;
    @ElementCollection
    private List<Integer> last_volume;
    public Exchange(){}
    public Exchange(String name, double score, double volume24h, int markets, int coins, List<Integer> last_volume) {
        this.name = name;
        this.score = score;
        this.volume24h = volume24h;
        this.markets = markets;
        this.coins = coins;
        this.last_volume = last_volume;
    }
}
