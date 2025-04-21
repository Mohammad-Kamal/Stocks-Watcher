package com.mohammadkamal.stockwatcher.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockAlertResponseDto {

    private BigDecimal targetPrice;
    private LocalDateTime createdAt;
    private boolean triggered;
    private UserEmailRequestDto user;
    private StockSymbolRequestDto stock;
}
