package com.programs1;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter total numbers ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp1=0;
		int temp2=1;
	
		for(int i=0;i<num;i++)
		{
			System.out.println(temp1);
			int a=temp1+temp2;
			temp1=temp2;
			temp2=a;
			
		}
	}

}
