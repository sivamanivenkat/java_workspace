package com.venkat.oops;


class BankAccount {
 protected String accountNumber;
 protected double balance;

 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: " + amount + ", New Balance: " + balance);
 }

 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
     } else {
         System.out.println("Insufficient Balance!");
     }
 }

 public void displayBalance() {
     System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
 }
}


class SavingsAccount extends BankAccount {
 private double interestRate;

 public SavingsAccount(String accountNumber, double balance, double interestRate) {
     super(accountNumber, balance); //used to access 
     this.interestRate = interestRate;
 }

 public void addInterest() {
     double interest = balance * interestRate / 100;
     balance += interest;
     System.out.println("Interest Added: " + interest + ", New Balance: " + balance);
 }
}


class CurrentAccount extends BankAccount {
 private double overdraftLimit;

 public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
     super(accountNumber, balance);
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public void withdraw(double amount) {
     if (balance + overdraftLimit >= amount) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
     } else {
         System.out.println("Overdraft Limit Exceeded!");
     }
 }
}

public class Inheritance {
 public static void main(String[] args) {
     SavingsAccount savings = new SavingsAccount("SA123", 5000, 5);
     savings.deposit(2000);
     savings.addInterest();
     savings.withdraw(3000);
     savings.displayBalance();

     System.out.println("----------------------");

     CurrentAccount current = new CurrentAccount("CA456", 10000, 5000);
     current.withdraw(12000);
     current.withdraw(4000);
     current.displayBalance();
 }
}

