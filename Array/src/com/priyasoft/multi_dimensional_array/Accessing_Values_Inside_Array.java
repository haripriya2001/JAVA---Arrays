package com.priyasoft.multi_dimensional_array;

public class Accessing_Values_Inside_Array {

	public static void main(String[] args) {
		int[][] a={{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160}};
		System.out.println(a[0][2]);//30
		System.out.println(a[1][3]);//80
		System.out.println(a[2][1]);//100
		System.out.println(a[3][0]);//130
		System.out.println();
		System.out.println("Length of MultiDimensional Array");
		System.out.println(a.length);//4
		System.out.println();
		System.out.println("Inner Array Length");
		System.out.println("One Dimensional Array 1 : " +a[0].length);
		System.out.println("One Dimensional Array 2 : " +a[1].length);
		System.out.println("One Dimensional Array 3 : " +a[2].length);
		System.out.println("One Dimensional Array 4 : " +a[3].length);
		System.out.println();
		System.out.println("Printing some values in array");
		System.out.println(a[a.length-1][a.length-3]);//a[4-1][4-3]--> a[3][1]-->o/p 140
		System.out.println(a[a[0].length-1][a[1].length-2]);//a[4-1][4-2]-->a[3][2]-->o/p 150

	}

}
