package com.example.paymentservice.service;

import org.springframework.stereotype.Service;

@Service
public class RazorPayGateway implements PaymentGateway {

    @Override
    public String generatePaymentLink(String name, String phonenumber, String email, Double amount, String Description) {
        return "";
    }
}
