package com.mohammadkamal.stockwatcher.service;

import com.mohammadkamal.stockwatcher.model.Stock;

import java.util.List;
import java.util.Optional;

public interface StockService {

    void addStock(Stock stock);
    Optional<Stock> getStockBySymbol(String symbol);
    List<Stock> getAllStock();
}
