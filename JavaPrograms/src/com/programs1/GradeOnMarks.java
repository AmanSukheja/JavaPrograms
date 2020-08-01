package com.programs1;

import java.util.Scanner;

public class GradeOnMarks {

	public static void main(String[] args) 
	{
		int marks[] = new int[5];
		Scanner sc=new Scanner(System.in);
		int total=0;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter marks in Subject " +(i+1));
			marks[i]=sc.nextInt();
			total+=marks[i];
		}
		sc.close();
		float avg=total/5;
		System.out.println("Avg is " +avg);
		
		if(avg>89)
			System.out.println("Grade A ");
		else if(avg>60 && avg<89)
			System.out.println("Grade B  ");
		else
			System.out.println("Grade C ");
		

	}

}
