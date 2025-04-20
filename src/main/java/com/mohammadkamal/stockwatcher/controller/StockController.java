package com.mohammadkamal.stockwatcher.controller;

import com.mohammadkamal.stockwatcher.exception.ResourceNotFoundException;
import com.mohammadkamal.stockwatcher.model.Stock;
import com.mohammadkamal.stockwatcher.service.StockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService){
        this.stockService  = stockService;
    }

    @PostMapping
    public void addStock(@PathVariable Stock stock){

        stockService.addStock(stock);
    }

    @GetMapping("/symbol")
    public ResponseEntity<Stock> getStockBySymbol(@PathVariable String symbol){

        return stockService.getStockBySymbol(symbol)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ResourceNotFoundException("Stock with symbol " + symbol + " not found"));
    }

    @GetMapping
    public List<Stock> getAllStock(){

        return stockService.getAllStock();
    }

}
