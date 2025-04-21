package com.mohammadkamal.stockwatcher.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockAlertRegisterRequestDto {

    private BigDecimal targetPrice;
    private StockSymbolRequestDto stock;
    private UserEmailRequestDto user;
}
