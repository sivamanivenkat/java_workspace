package com.venkat.javabasics;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a color : ");
		String s = sc.nextLine();
		
		switch (s){
		case "red":{
			System.out.println("The color is red");
			break;
		}
		case "green":{
			System.out.println("The color is green");
			break;
		}
		case "blue":{
			System.out.println("The color is blue");
			break;
		}
		case "yellow":{
			System.out.println("The color is yellow");
			break;
		}
		case "orange":{
			System.out.println("The color is orange");
			break;
		}
			
		}
		
	}

}
