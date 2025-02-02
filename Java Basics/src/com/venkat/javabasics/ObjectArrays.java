package com.venkat.javabasics;


class Student{
	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
}
public class ObjectArrays {
	public static void main(String[] args) {
		Student[] std = new Student[4];
		
		std[0] = new Student(1, "Siva");
		std[1] = new Student(2, "Mani");
		std[2] = new Student(3, "Venkat");
		std[3] = new Student(4, "Korlakunta");
		
		for(int i=0;i<std.length;i++) {
			System.out.println(std[i].id + " : " + std[i].name);
		}
		
	}
}
