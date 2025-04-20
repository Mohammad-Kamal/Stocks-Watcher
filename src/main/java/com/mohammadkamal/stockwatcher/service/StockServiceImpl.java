package com.mohammadkamal.stockwatcher.service;

import com.mohammadkamal.stockwatcher.exception.ResourceNotFoundException;
import com.mohammadkamal.stockwatcher.model.Stock;
import com.mohammadkamal.stockwatcher.repository.StockRepository;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.annotations.NotFound;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService{


    private final StockRepository stockRepository;

    public StockServiceImpl(StockRepository stockRepository){
        this.stockRepository = stockRepository;
    }

    @Override
    public void addStock(Stock stock) {
        Optional<Stock> stockExist = getStockBySymbol(stock.getSymbol());
        if(stockExist.isPresent()){
            throw new RuntimeException("The stock with symbol " + stock.getSymbol() + " is already exists.");
        }
        stockRepository.save(stock);
    }

    @Override
    public Optional<Stock> getStockBySymbol(String symbol) {

        Optional<Stock> stock = stockRepository.findBySymbol(symbol);
        if(stock.isEmpty()) {
            throw new ResourceNotFoundException("Stock with symbol " + symbol + " dosen`t exists");
        }
        return stock;
    }

    @Override
    public List<Stock> getAllStock() {
        return stockRepository.findAll();
    }
}
