package com.mohammadkamal.stockwatcher.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Stock {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true,
            length = 10)
    @NotNull
    private String symbol;

    @NotNull
    private BigDecimal currentPrice;

    @Column(length = 100)
    @NotNull
    private String companyName;

    @ManyToMany(mappedBy = "favoriteStock")
    private List<User> user = new ArrayList<>();

    @OneToMany(mappedBy = "stock")
    private List<StockAlert> stockAlert = new ArrayList<>();

}
