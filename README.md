# PaymentService

This project is a simple **Spring Boot service** that integrates with **Stripe** to generate payment links dynamically. The service creates a price and generates a payment link that redirects users upon completion.

## Features

- Generates Stripe payment links for a specified product (e.g., "iPhone").
- Handles price creation dynamically using Stripe API.
- Supports redirect after payment completion.
- Configurable Stripe API key via properties.

## Technologies Used

- Java 17+ (or your project Java version)
- Spring Boot
- Stripe Java SDK

## Getting Started

### Prerequisites

- Java installed
- Maven
- Stripe account (for API key)

### Configuration

Update your `application.properties` or `application.yml`:
⚠ **Important:**  
👉 Replace `sk_test_your_stripe_secret_key_here` with your actual Stripe secret key (test or live).  
👉 Never commit your real secret key to version control. Use environment variables or a secrets manager in production.

---

## 🛠 Build & Run

### Maven
```bash
mvn clean install
mvn spring-boot:run


**Example Flow**
1️⃣ **The service creates a Stripe Price object:**
Product: iPhone
Amount: ₹2,000.00 (200000 paise)
Currency: INR

2️⃣ **It generates a Payment Link for that price.**

3️⃣ **After successful payment, the user is redirected to:**
https://www.amazon.in/
