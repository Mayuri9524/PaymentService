package com.example.paymentservice.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    PayementGatwaySelector payementGatwaySelector;

    public PaymentServiceImpl(PayementGatwaySelector payementGatwaySelector) {
        this.payementGatwaySelector = payementGatwaySelector;
    }
    @Override
    public String initiatePayment() {
        return payementGatwaySelector
                .getPaymentGateway()
                .generatePaymentLink();
    }
}
