package com.stringPrograms;

public class OccuranceOfChar {

	public static void main(String[] args) {

		String str="Malaala";
		int count = 0;
		int count1 = 0;
		for(char ch : str.toCharArray()) {
			if(ch=='a') {
				count+=1;
			}
		}
		System.out.println("Number of a in Malaala = " +count);
		
		char[] chr= str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(chr[i]=='M') {
				count1++;
			}
		}
		System.out.println("Number of m : "+count1);
	}

}
