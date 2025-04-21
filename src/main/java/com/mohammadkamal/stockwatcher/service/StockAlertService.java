package com.mohammadkamal.stockwatcher.service;

import com.mohammadkamal.stockwatcher.model.StockAlert;

import java.math.BigDecimal;
import java.util.List;

public interface StockAlertService {

    void createStockAlert(Long userId, Long stockId, BigDecimal targetPrice);
    List<StockAlert> getAlertsForUser(Long userId);
}
