//TrendDto.java
package ru.kimi.dto;

import lombok.Data;

@Data
public class TrendDto {
    private String coin_name;
    private String coin_code;
    private double hour24;
}