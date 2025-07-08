package com.example.paymentservice.service;

public interface PaymentGateway {
  String generatePaymentLink(String name, String phonenumber, String email, Double amount, String Description);
}

