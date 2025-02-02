package com.venkat.javabasics;

public class ForLoop {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Right-Angled Triangle Pattern");
        // Right-Angled Triangle Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Inverted Right-Angled Triangle Pattern"); 

        // Inverted Right-Angled Triangle Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i=1;i<=n;i++) {
        	for(int j=i;j<=n;j++) {
        		System.out.print("  ");
        	}
        	for(int j=1;j<=i;j++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        
        System.out.println("Hill Pattern");
        
        //Hill Pattern
        
        for(int i=1;i<=n;i++) {
        	for(int j=i;j<=n;j++) {
        		System.out.print("  ");
        	}
        	for(int j=1;j<i;j++) {
        		System.out.print("* ");
        	}
        	for(int j=1;j<=i;j++) {
            	System.out.print("* ");	
        	}
        	System.out.println();
        }
        
        System.out.println("Decreasing hill pattern");
        
        //Decreasing hill pattern
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=i;j++){
        		System.out.print("  ");
        	}
        	for(int j=i;j<n;j++){
        		System.out.print("* ");
        	}
        	for(int j=i;j<=n;j++){
        		System.out.print("* ");
        	}
        	System.out.println();

        }
        
        System.out.println("Pyramid pattern");
        
        for(int i=1;i<n;i++) {
        	for(int j=i;j<=n;j++) {
        		System.out.print("  ");
        	}
        	for(int j=1;j<i;j++) {
        		System.out.print("* ");
        	}
        	for(int j=1;j<=i;j++) {
            	System.out.print("* ");	
        	}
        	System.out.println();
        }
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=i;j++){
        		System.out.print("  ");
        	}
        	for(int j=i;j<n;j++){
        		System.out.print("* ");
        	}
        	for(int j=i;j<=n;j++){
        		System.out.print("* ");
        	}
        	System.out.println();

        }


        
        
    }
}
