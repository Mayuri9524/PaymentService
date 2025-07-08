package com.example.paymentservice.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentGatewaySelectorImpl implements PayementGatwaySelector{

    RazorPayGateway razorPayGateway;
    StripeGateway stripeGateway;

    public PaymentGatewaySelectorImpl(RazorPayGateway razorPayGateway, StripeGateway stripeGateway) {
        this.razorPayGateway = razorPayGateway;
        this.stripeGateway = stripeGateway;
    }
    @Override
    public PaymentGateway getPaymentGateway() {

        return stripeGateway;
    }
}