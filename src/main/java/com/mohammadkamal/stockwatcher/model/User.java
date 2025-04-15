package com.mohammadkamal.stockwatcher.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import javax.annotation.processing.Generated;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

    @ManyToMany
    @JoinTable(
            name = "favorite_stock",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "stock_id")
    )
    private List<Stock> favoriteStock= new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<StockAlert> stockAlert = new ArrayList<>();

}
