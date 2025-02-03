package com.venkat.oops;

class Person{
	String firstName;
	String lastName;
	int age;
	
	Person(String firstName){
		this.firstName = firstName;
		System.out.println("First Name : " + firstName);
	}
	
	Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("First Name : " + firstName + " Last Name : " + lastName);

	}
	
	Person(String firstName, int age){
		this.firstName = firstName;
		this.age = age;
		
		System.out.println("First Name : " + firstName + " Age : " + age);

	}
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		Person per = new Person("Venkat");
		Person per2 = new Person("Venkat", "Korlakunta");
		Person per3 = new Person("Venkat", 25);
	}

}
