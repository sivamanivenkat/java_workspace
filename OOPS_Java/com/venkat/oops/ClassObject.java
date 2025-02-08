package com.venkat.oops;

class Calculator{
	private int a;
	private int b;
	
	Calculator(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public void sum() {
		System.out.println(a+b);
	}
	public void subtract() {
		System.out.println(a-b);
	}

	public void multiply() {
		System.out.println(a*b);
	}

	public void divide() {
		System.out.println(a/b);
	}
	public void remainder() {
		System.out.println(a%b);
	}
	

	
}	
public class ClassObject {
	
	public static void main(String[] args) {
	Calculator c = new Calculator(10,20);
	c.sum();
	c.subtract();
	c.multiply();
	c.divide();
	c.remainder();
	}

}
