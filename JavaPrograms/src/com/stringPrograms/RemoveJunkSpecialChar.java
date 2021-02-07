package com.stringPrograms;

public class RemoveJunkSpecialChar {

	public static void main(String[] args) {
		
		String s = "@R@#@#@$@&#$&hsd  982AMAN(#&# )";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
