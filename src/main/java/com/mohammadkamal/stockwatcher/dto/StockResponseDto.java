package com.mohammadkamal.stockwatcher.dto;

import com.mohammadkamal.stockwatcher.model.StockAlert;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockResponseDto {

    private String symbol;
    private String companyName;
    private BigDecimal currentPrice;
}
