package com.example.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentRequestDto {
    private String name;
    private String phoneNumber;
    private String email;
    private Double amount;
    private String description;
}
