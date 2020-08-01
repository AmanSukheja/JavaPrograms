package com.programs1;

import java.util.Scanner;

public class DivisibleBy {

	public static void main(String[] args)
	{
		System.out.println("Enter a number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		if(n==0)
			System.out.println("Number is not divisible by 7");
		else if(n%7==0)
			System.out.println("Number is divisible by 7");
	
		else
			System.out.println("Number is not divisible by 7");

	}

}
