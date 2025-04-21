package com.mohammadkamal.stockwatcher.dto;

import com.mohammadkamal.stockwatcher.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockRegisterRequestDto {

    private String symbol;
    private UserEmailRequestDto user;
}
