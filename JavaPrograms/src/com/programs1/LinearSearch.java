package com.programs1;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int array[];
		System.out.println("Enter how many numbers in array you want to enter ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		array=new int[num];
		for(int i=0;i<num;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Enter number to be searched ");
		int search=sc.nextInt();
		
		for (int j = 0; j < num; j++)
	      {
	         if (array[j] == search) 
	         {
	           System.out.println(search+" is present at location "+(j+1));
	           /*Item is found so to stop the search and to come out of the 
	            * loop use break statement.*/
	           break;
	         }
	      }
		//if(i==num)
			//2	System.out.println("not found");
		sc.close();
	}

}
