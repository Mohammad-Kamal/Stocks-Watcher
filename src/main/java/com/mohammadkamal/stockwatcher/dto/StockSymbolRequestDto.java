package com.mohammadkamal.stockwatcher.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockSymbolRequestDto {

    private String symbol;
    private String companyName;
}
