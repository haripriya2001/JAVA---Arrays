package com.priyasoft.multi_dimensional_array;

public class Retreive_Values_Using_ForLoop {

	public static void main(String[] args) {
		int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println("Printing Values Using For Loop");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+ " ");
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Printing Using For Each Loop");
		for(int[] b: a)
		{
			for(int x:b)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}

	}

}
