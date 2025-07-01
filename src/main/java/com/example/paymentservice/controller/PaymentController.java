package com.example.paymentservice.controller;

import com.example.paymentservice.service.PaymentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paymentService")
public class PaymentController {

    PaymentService paymentService;
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/initiatePayment/{orderId}")
    public String initiatepayment(@PathVariable("orderId") String orderId)
    {
        //call orderservice API to get order details
        return paymentService.initiatePayment();
    }
}
