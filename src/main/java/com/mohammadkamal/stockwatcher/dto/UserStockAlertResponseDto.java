package com.mohammadkamal.stockwatcher.dto;

import com.mohammadkamal.stockwatcher.model.StockAlert;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserStockAlertResponseDto {

    private List<StockAlertResponseDto> alerts;
}
