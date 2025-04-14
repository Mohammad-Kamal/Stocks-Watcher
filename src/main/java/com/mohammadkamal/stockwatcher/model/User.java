package com.mohammadkamal.stockwatcher.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import org.antlr.v4.runtime.misc.NotNull;

import javax.annotation.processing.Generated;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Email
    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    private Integer age;

    @NotNull
    private LocalDate birthDate;

    @OneToMany
    private List<Stock> favoriteStocks= new ArrayList<>();

    @OneToMany
    private List<StockAlert> stockAlerts = new ArrayList<>();

}
