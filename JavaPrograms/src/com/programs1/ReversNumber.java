package com.programs1;

import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {
		
		
		System.out.println("Enter number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			 int n = num%10;
			 rev=rev*10+n;
			num=num/10;	
			
		}
		System.out.println(rev); 
		
		
		//** Method -2 
		
		long num1 = 123456;
		StringBuffer sb = new StringBuffer(String.valueOf(num1));
		System.out.println(sb.reverse());
		
		
		/*
		 * int t=1; System.out.println("Enter power" ); int p=sc.nextInt(); for(int
		 * i=0;i<p;i++) { t= t*num;
		 * 
		 * } System.out.println(t);
		 */
		
	}

}
