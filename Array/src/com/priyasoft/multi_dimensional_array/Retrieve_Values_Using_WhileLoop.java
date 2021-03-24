package com.priyasoft.multi_dimensional_array;

public class Retrieve_Values_Using_WhileLoop {

	public static void main(String[] args) {
		int[][] a={{0,0,0,0},{1,1,1,1},{2,2,2,2},{3,3,3,3}};
		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[i].length)
			{
				System.out.print(a[i][j]+" ");
			    j++;
			}
			i++;
			System.out.println();
		}

	}

}
