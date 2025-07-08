package com.example.paymentservice.service;

public interface PaymentService {
    public String initiatePayment(String name, String phonenumber, String email, Double amount, String Description);
}
