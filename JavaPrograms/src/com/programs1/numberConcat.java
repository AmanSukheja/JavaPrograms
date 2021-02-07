package com.programs1;

public class numberConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {2,5,6,9};
		String c="";
		for(int i=0;i<arr.length;i++)
		{
			c=c+String.valueOf(arr[i]);
		}

		System.out.println(c);
	}

}
