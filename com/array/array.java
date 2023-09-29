package com.array;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
		        System.out.println("Enter the number");
		        Scanner sc = new Scanner(System.in);
		        int a=sc.nextInt();
		        int[] st = new int[a];

		        for(int s=0 ; s< st.length; s++)
		        {
		           System.out.println("Student " + s); 
		        }
		        sc.close();
		    
	}

}
