package com.stringPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		String names[] = {"java", "c", "C++", "python", "java", "c"};
		for(int i=0;i<names.length-1; i++)
		{
			for(int j=i+1; j<names.length; j++)
			{
				if(names[i].equalsIgnoreCase(names[j]))
				{
					System.out.println("Duplicate Element is : " +names[i]);
				}
			}
		}
		
		//************ Method -2 : Using HashSet **********
		System.out.println("****************************");
		
		Set<String> store = new HashSet<String>();
		for(String name:names)
		{
			if(store.add(name)==false) {
				System.out.println("Duplicate Element is : " +name);
			}
		}
		
		

	}

}
