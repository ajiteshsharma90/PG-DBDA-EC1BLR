/*### 2. *E-commerce Payment System*
*Problem Statement:*
You are developing an *E-commerce Payment System* that needs to support multiple payment methods like credit card, debit card, PayPal, 
and cryptocurrency. Each payment method follows different procedures to process a payment,
but the system must provide a unified way to process any type of payment without knowing the internal details of each payment method.

*Objective:*
- Use abstraction to create an abstract class PaymentMethod with methods like processPayment(amount) and refund(amount).
- Implement concrete subclasses like CreditCardPayment, PayPalPayment, and CryptoPayment that provide 
specific implementations of these methods depending on the payment type.

*Key Focus:*
- The system should hide the complexity of different payment processing mechanisms by providing a unified interface for handling payments.
- Use abstraction to simplify the system’s interaction with various payment methods and
make it easier to extend in the future when new payment methods are added.*/


package Assignment4abstract;



public class Payment 
{

}
