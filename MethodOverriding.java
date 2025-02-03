package com.venkat.oops;

//Parent class - Employee
class Employee {
 protected String name;
 protected int employeeId;
 protected double baseSalary;

 public Employee(String name, int employeeId, double baseSalary) {
     this.name = name;
     this.employeeId = employeeId;
     this.baseSalary = baseSalary;
 }


 public void calculateSalary() {
     System.out.println("Base Salary of Employee: $" + baseSalary);
 }
}


class FullTimeEmployee extends Employee {
 private double bonus;

 public FullTimeEmployee(String name, int employeeId, double baseSalary, double bonus) {
     super(name, employeeId, baseSalary);
     this.bonus = bonus;
 }


 public void calculateSalary() {
     double totalSalary = baseSalary + bonus;
     System.out.println(name + " (Full-Time) - Total Salary: $" + totalSalary);
 }
}


class ContractEmployee extends Employee {
 private int hoursWorked;
 private double hourlyRate;

 public ContractEmployee(String name, int employeeId, int hoursWorked, double hourlyRate) {
     super(name, employeeId, 0); // No base salary for contract employees
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }


 public void calculateSalary() {
     double totalSalary = hoursWorked * hourlyRate;
     System.out.println(name + " (Contract) - Total Salary: $" + totalSalary);
 }
}


public class MethodOverriding {
 public static void main(String[] args) {
     Employee emp1 = new FullTimeEmployee("Siva Mani", 101, 5000, 1000);
     Employee emp2 = new ContractEmployee("Venkat", 102, 160, 30);

     emp1.calculateSalary();
     emp2.calculateSalary(); 
 }
}

