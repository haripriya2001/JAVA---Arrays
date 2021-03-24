package com.priyasoft.array;

public class Retrieve_Values_Using_Forloop {

	public static void main(String[] args) {
		int[] a={1,3,30,-1,-2,40};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		System.out.println();
		//Using For Each Loop
		for(int x:a)
		{
			System.out.println(x);
		}
		System.out.println();
	}

}
