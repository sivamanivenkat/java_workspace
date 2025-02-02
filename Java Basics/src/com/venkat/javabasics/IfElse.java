package com.venkat.javabasics;

import java.util.Scanner;

public class IfElse {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int i = sc.nextInt();
		
		if(i<20) {
			System.out.println("The input value is less than 20");
		}
		else if(i == 20) {
			System.out.println("The input value is equal to 20");
			}
		else {
			System.out.println("The input is greater than 20");
		}
		}
}
