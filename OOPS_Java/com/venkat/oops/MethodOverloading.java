package com.venkat.oops;


class PaymentProcessor {

 
 public void processPayment(String cardNumber, String expiryDate, double amount) {
     System.out.println("Processing Credit Card Payment");
     System.out.println("Card Number: " + cardNumber);
     System.out.println("Amount: $" + amount);
     System.out.println("Payment Successful!\n");
 }


 public void processPayment(String cardNumber, int pin, double amount) {
     System.out.println("Processing Debit Card Payment");
     System.out.println("Card Number: " + cardNumber);
     System.out.println("Amount: $" + amount);
     System.out.println("Payment Successful!\n");
 }
}


public class MethodOverloading {
 public static void main(String[] args) {
     PaymentProcessor payment = new PaymentProcessor();

     payment.processPayment("1234-5678-9876-5432", "12/26", 250.75);

     payment.processPayment("9876-5432-1234-6789", 1234, 150.50);

 }
}
