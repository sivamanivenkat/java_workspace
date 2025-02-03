package com.venkat.oops;

abstract class Animal{
	abstract void makeSound();
	
	void eat() {
		System.out.println("Eating...");
	}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog makes Bow Bow sound!!");
	}
}

class Cat extends Animal{
	void makeSound() {
		System.out.println("Cat makes Meow Meow sound!!");
	}
}
public class Abstraction {
	public static void main(String[] args) {
	Animal dog = new Dog();
	Animal cat = new Cat();
	
	dog.makeSound();
	dog.eat();
	cat.makeSound();
	cat.eat();
	}

}
