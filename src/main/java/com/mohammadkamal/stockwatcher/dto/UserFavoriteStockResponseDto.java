package com.mohammadkamal.stockwatcher.dto;

import com.mohammadkamal.stockwatcher.model.Stock;
import com.mohammadkamal.stockwatcher.model.StockAlert;
import lombok.Data;

import java.util.List;

@Data
public class UserFavoriteStockResponseDto {
    private List<StockResponseDto> favoriteStock;
}
