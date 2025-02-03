package com.venkat.oops;

class Student{
	private int id;
	private String name;
	private char section;
	
	public void setId(int id) {
		this.id = id;
		}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSection(char section) {
		this.section = section;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public char getSection() {
		return section;
	}

	@Override
	public String toString() {
		return "Student [id=" + getId() + ", name=" + getName() + ", section=" + getSection() + "]";

	}

}
public class Encapsulation {
	public static void main(String[] args) {
		Student std = new Student();
		std.setId(1);
		std.setName("Venkat");
		std.setSection('A');
		
		System.out.print(std.toString());
	}
}
