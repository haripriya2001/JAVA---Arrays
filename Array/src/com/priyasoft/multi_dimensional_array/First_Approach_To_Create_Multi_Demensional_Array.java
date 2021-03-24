package com.priyasoft.multi_dimensional_array;

public class First_Approach_To_Create_Multi_Demensional_Array {

	public static void main(String[] args) {
		int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int[] x:a)
		{
			for(int[] y:a)
			{
				System.out.println(x);
				System.out.println(y);
			}
		}
	}

}
