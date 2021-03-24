package com.priyasoft.multi_dimensional_array;

public class Print_Reference_Value_Of_Array {

	public static void main(String[] args) {
		int[][] a={{1,2,3,4},{-1,-2,-3,-4},{5,6,7,8},{-5,-6,-7,-8}};
        System.out.println("Print Whole Reference Values");
		System.out.println(a);
		System.out.println();
        System.out.println("Printing Inner Arrays Reference Values");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println();
        System.out.println("Printing Inner Array Reference Value Using For Loop");
        for(int[] x:a)
        {
        	System.out.println(x);
        }
	}

}
