//Trend.java
package ru.kimi.model;

import lombok.Data;

@Data
public class Trend {
    private String coin_name;
    private String coin_code;
    private double hour24;

    public Trend(String coin_name, String coin_code, double hour24) {
        this.coin_name = coin_name;
        this.coin_code = coin_code;
        this.hour24 = hour24;
    }
}