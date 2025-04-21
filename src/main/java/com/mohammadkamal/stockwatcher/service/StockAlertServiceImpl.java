package com.mohammadkamal.stockwatcher.service;

import com.mohammadkamal.stockwatcher.exception.ResourceNotFoundException;
import com.mohammadkamal.stockwatcher.model.StockAlert;
import com.mohammadkamal.stockwatcher.model.User;
import com.mohammadkamal.stockwatcher.model.Stock;
import com.mohammadkamal.stockwatcher.repository.StockAlertRepository;
import com.mohammadkamal.stockwatcher.repository.StockRepository;
import com.mohammadkamal.stockwatcher.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class StockAlertServiceImpl implements StockAlertService{

    private final StockAlertRepository stockAlertRepository;

    private final UserRepository userRepository;

    private final StockRepository stockRepository;

    public StockAlertServiceImpl(StockAlertRepository stockAlertRepository, UserRepository userRepository, StockRepository stockRepository){
        this.stockAlertRepository = stockAlertRepository;
        this.userRepository = userRepository;
        this.stockRepository = stockRepository;
    }

    @Override
    public void createStockAlert(Long userId, Long stockId, BigDecimal targetPrice) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("There is no user with id: " + userId ));

        Stock stock = stockRepository.findById(stockId)
                .orElseThrow(() -> new ResourceNotFoundException("There is no stock with id: " + stockId));

        StockAlert alert = new StockAlert();

        alert.setUser(user);
        alert.setStock(stock);
        alert.setTargetPrice(targetPrice);

        stockAlertRepository.save(alert);
    }

    @Override
    public List<StockAlert> getAlertsForUser(Long userId) {
        return stockAlertRepository.findByUserId(userId);
    }

}
