package com.mohammadkamal.stockwatcher.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NotBlank
@Email
@AllArgsConstructor
@NoArgsConstructor
public class UserEmailRequestDto {

    private String email;
}
