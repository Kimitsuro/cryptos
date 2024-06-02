//Trend.java
package ru.kimi.model;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Trend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String coin_name;
    private String coin_code;
    private double hour24;
    public Trend(){}
    public Trend(String coin_name, String coin_code, double hour24) {
        this.coin_name = coin_name;
        this.coin_code = coin_code;
        this.hour24 = hour24;
    }
}
