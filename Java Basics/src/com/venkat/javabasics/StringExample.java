package com.venkat.javabasics;

public class StringExample {
	public static void main(String[] args) {
		String str = "Venkat";  //String literal
		
		String s= new String("Venkat");
		
		System.out.println(str.equals(s));
		System.out.println(str == s);
		
		s.concat(" K");
		System.out.println(s);
		
		String name = s.concat(" K");
		System.out.println(name);
		
		System.out.println(name.charAt(3));
		
		String s2 = name.replace('V','v');
		System.out.println(s2);
		
		System.out.println(name.indexOf('a'));
		
		System.out.println(name.indexOf('a', 5));
		
		
		//String Buffer
		System.out.println();
		System.out.println("String Buffer");
		
		StringBuffer sc = new StringBuffer("Siva Mani Venkat");
		System.out.println(sc);
		sc.append(" Korlakunta");
		System.out.println(sc);
		
		sc.reverse();
		System.out.println(sc);
		
		System.out.println(sc.capacity());
		
		sc.ensureCapacity(50);
		System.out.println(sc.capacity());
		
		sc.delete(2, 6);
		System.out.println(sc);
		
		sc.deleteCharAt(2);
		System.out.println(sc);
		
		
		String s1 = "Venkat";
		
		StringBuffer sbr1 = new StringBuffer(s1);
		sbr1.append('K');
		System.out.println(s1);
		System.out.println(sbr1);
		
		StringBuilder sb1 = new StringBuilder(s1);
		sb1.insert(0, "Mani ");
		System.out.println(sb1);
		
//		StringBuilder sb2 = new StringBuilder(sbr1);
//		System.out.println(sb2);
		
		StringBuffer sb = new StringBuffer("Hello");
		StringBuilder sb2 = new StringBuilder(sb);
		System.out.println(sb2);
		
		
		}

}
