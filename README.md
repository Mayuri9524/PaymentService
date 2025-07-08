**Payment Service API**
This service integrates with Stripe to initiate a payment session.

📍 **Endpoint**
URL:
POST http://localhost:8080/paymentService/initiatePayment/

📦 **Request Body**
Send a JSON payload as follows:
{
  "name": "iPhone",
  "phoneNumber": "54835893",
  "email": "mahemail@gmail.com",
  "amount": 300.00,
  "description": "Product"
}

✅ **Response**
A successful response will return a Stripe example Checkout URL:
https://buy.stripe.com/test_14A6oJ3Wegt60j2ebf8IU06
The user can be redirected to this URL to complete the payment.

💳 **Test Cards for Stripe**
Use the following test cards to simulate various payment scenarios. All cards use any future expiry date and CVC = 123 unless mentioned otherwise.
Scenario	Card Number
✅ Success (India)	4000 0035 6000 0008

❌ Generic Decline	4000 0000 0000 0002

❌ Insufficient Funds	4000 0000 0000 9995

❌ Lost Card	4000 0000 0000 9987

❌ Stolen Card	4000 0000 0000 9979

❌ Expired Card	4000 0000 0000 0069

❌ Incorrect CVC	4000 0000 0000 0127

❌ Processing Error	4000 0000 0000 0119

❌ Incorrect Number	4242 4242 4242 4241

❌ Exceeding Velocity Limit	4000 0000 0000 6975

🔁 **Testing Instructions**
1. Call the /initiatePayment endpoint with the provided JSON payload.
2. Redirect the user to the Stripe URL returned in the response.
3. Use one of the test cards from the table above during checkout to simulate a scenario.

📌 **Notes**
1. You must have your Stripe test API keys configured in the backend.
2. This setup is for test environment only.
