//Deal.java
package ru.kimi.model;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Data
@Entity
public class Deal {
    @Id
    private Long id;
    private String date;
    private String type;
    private double price;
    private double volume;
    private String coin_name;
    private String coin_code;

    public Deal(String date, String type, double price, double volume, String coin_name, String coin_code) {
        this.date = date;
        this.type = type;
        this.price = price;
        this.volume = volume;
        this.coin_name = coin_name;
        this.coin_code = coin_code;
    }
}