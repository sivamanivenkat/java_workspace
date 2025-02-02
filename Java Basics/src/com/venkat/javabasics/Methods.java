package com.venkat.javabasics;


class Super{
	int i;
	Super(int i){
		this.i = i;
	}
	
	int text() {
		return i;
	}
	
	
	static void print() {
		System.out.println("Inside a static method");
	}
}
public class Methods {
	public static void main(String args[]) {
		Methods methods = new Methods();
		System.out.println(methods.hashCode());
		Super.print();
		
		Super sup = new Super(5);
		System.out.println("The given number is : " + sup.text());
		
	}

}
