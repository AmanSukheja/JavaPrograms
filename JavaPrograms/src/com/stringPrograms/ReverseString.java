package com.stringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Enter string 1 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		str1 = str1.reverse();

		System.out.println("Reverse of the string 1 is  : " + str1);
		
	//	****************************************
		
	//	System.out.println("Enter String 2 : ");
		String str2 = "hello india";
		char[] ch = str2.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
			System.out.print(ch[i]);
		
		// ******************************
		
		String str3 = "hello world";
		
		String rev="";
		for(int i=str3.length()-1;i>=0;i--)
		{
			rev=rev+str3.charAt(i);
		}
		System.out.println(rev);
		sc.close();
		
		
	}


}
