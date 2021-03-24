package com.priyasoft.multi_dimensional_array;

public class Second_Approach_To_Create_MultiDimensional_Array {

	public static void main(String[] args) {
		int[][] a= new int[3][3];
		a[0][0]=1;
		a[0][1]=1;
		//a[0][2]=1; print default value of datatype
		a[1][0]=2;
		a[1][1]=1;
		//a[1][2]=2; print default value of datatype
		a[2][0]=3;
		a[2][1]=3;
		//a[2][2]=2; print default value of datatype
		for(int[] b: a)
		{
			for(int x: b)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}
