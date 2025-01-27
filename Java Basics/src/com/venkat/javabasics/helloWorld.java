package com.venkat.javabasics;

class Helper{
	
	public String print() {
		return "Hello, I am Venkat, practiccing Java!!";
	}
}

public class helloWorld {
	
	public static void main(String[] args) {
		
		Helper help = new Helper();
		System.out.println(help.print());
		
	}
}
