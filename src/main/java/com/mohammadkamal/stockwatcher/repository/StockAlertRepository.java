package com.mohammadkamal.stockwatcher.repository;

import com.mohammadkamal.stockwatcher.model.StockAlert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface StockAlertRepository extends JpaRepository<StockAlert, Long> {

    List<StockAlert> findByUserId(Long userID);
}
