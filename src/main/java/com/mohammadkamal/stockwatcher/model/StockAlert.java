package com.mohammadkamal.stockwatcher.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class StockAlert {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private BigDecimal targetPrice;

    @NotNull
    private LocalDateTime createdAt;

    @NotNull
    private boolean triggered = false;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "stock_id", nullable = false)
    private Stock stock;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
    }
}
