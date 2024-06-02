//DealDto.java
package ru.kimi.dto;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class DealDto {
    private String date;
    private String type;
    private double price;
    private double volume;
    private String coin_name;
    private String coin_code;

    public DealDto() {
    }

    public DealDto(String date, String type, double price, double volume, String coin_name, String coin_code) {
        this.date = date;
        this.type = type;
        this.price = price;
        this.volume = volume;
        this.coin_name = coin_name;
        this.coin_code = coin_code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getCoin_name() {
        return coin_name;
    }

    public void setCoin_name(String coin_name) {
        this.coin_name = coin_name;
    }

    public String getCoin_code() {
        return coin_code;
    }

    public void setCoin_code(String coin_code) {
        this.coin_code = coin_code;
    }
}