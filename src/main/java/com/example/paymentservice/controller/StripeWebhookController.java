package com.example.paymentservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StripeWebhookController {
    @PostMapping("/stripeWebhook")
    public void webhook(@RequestBody Object payload) {
        System.out.println(payload);
    }
}
