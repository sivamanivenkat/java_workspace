package com.venkat.javabasics;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum += Math.pow(i, 2);
            System.out.println("Iteration " + i + ": sum = " + sum); // Debugging statement
            i++; 
        }

        System.out.println("Final sum: " + sum); 
        
        //Do-while loop used to execute the code at least once.
        
        Scanner sc = new Scanner(System.in);
        int age;
        
        do {
        	System.out.print("Enter your Age : " );
        	age = sc.nextInt();
        	}while(age<=0);
        
        System.out.println("Age of the applicant : " + age);
        sc.close();
        
    }
}
