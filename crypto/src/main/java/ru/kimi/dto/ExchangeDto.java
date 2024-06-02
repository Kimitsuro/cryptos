//ExchangeDto.java
package ru.kimi.dto;

import lombok.Data;
import java.util.List;

@Data
public class ExchangeDto {
    private String name;
    private double score;
    private double volume24h;
    private int markets;
    private int coins;
    private List<Integer> last_volume;
}