package com.stringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		
		//char[] ch = str.toCharArray();
		

        LinkedHashSet<Character> lhs = new LinkedHashSet<>(); 
        for(int i=0;i<str.length();i++) 
            lhs.add(str.charAt(i)); 
          
        // print string after deleting duplicate elements 
        
        for(Character ch : lhs) 
            System.out.print(ch);

	}

}
