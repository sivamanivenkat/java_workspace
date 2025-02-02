package com.venkat.javabasics;

public class Arrays {
	public static void main(String[] args) {
		int arr[] = new int[5];
		
		int  n = arr.length;
		
		for(int i=0;i<n;i++) {
			arr[i] = i*2;
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("The Element at index " +i+" is "+arr[i]);
		}
		
		sum(arr);
	}
		
		public static void sum(int[] arr) {
			
			int sum = 0;
			for(int i=0;i<arr.length;i++) {
				sum += i;
			}
			
			System.out.print("The sum of the elements in the array is : "+sum);
	}

}
