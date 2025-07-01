package com.example.paymentservice.service;

import org.springframework.stereotype.Service;

@Service
public class RazorPayGateway implements PaymentGateway {

    @Override
    public String generatePaymentLink() {
        return "";
    }
}
