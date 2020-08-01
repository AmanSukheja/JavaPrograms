package com.programs1;

import java.util.Scanner;

public class VowelCons {

	public static void main(String[] args) 
	{
		System.out.println("Enter the letter ");
		Scanner sc=new Scanner(System.in);
		String ch = sc.next();
		sc.close();
		switch(ch)
		{
		case "a":
			System.out.println(ch +" is a vowel");
			break;
		
		case "i":
			System.out.println(ch +" is a vowel");
			break;
			
		case "o":
			System.out.println(ch +" is a vowel");
			break;
			
		case "u":
			System.out.println(ch +" is a vowel");
			break;
			
		case "e":
			System.out.println(ch +" is a vowel");
			break;
			
		default:
			System.out.println(ch + " is consonant ");
		}

	}

}
