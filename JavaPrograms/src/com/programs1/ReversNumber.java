package com.programs1;

import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {
		
		
		System.out.println("Enter number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	/*	int rev=0;
		while(num!=0)
		{
			 int n = num%10;
			 rev=rev*10+n;
			num=num/10;	
			
		}
		System.out.println(rev); */
		int t=1;
		System.out.println("Enter power" );
		int p=sc.nextInt();
		for(int i=0;i<p;i++)
		{
			t= t*num;
			
		}
		System.out.println(t);
		
	}

}
