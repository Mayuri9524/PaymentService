package com.example.paymentservice.controller;

import com.example.paymentservice.dtos.InitiatePaymentRequestDto;
import com.example.paymentservice.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paymentService")
public class PaymentController {

    PaymentService paymentService;
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/initiatePayment/")
    public String initiatepayment(@RequestBody InitiatePaymentRequestDto initiatePaymentRequestDto)
    {
        //call orderservice API to get order details
        return paymentService.initiatePayment(initiatePaymentRequestDto.getName(), initiatePaymentRequestDto.getPhoneNumber(), initiatePaymentRequestDto.getEmail(), initiatePaymentRequestDto.getAmount(), initiatePaymentRequestDto.getDescription());
    }
}
