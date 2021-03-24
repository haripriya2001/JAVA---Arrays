package com.priyasoft.array;

public class Print_Array_Reference_Value {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		System.out.println(a);//[I@15db9742
		System.out.println(a[4]);//50
        System.out.println(a[1]);//20
        //System.out.println(a[5]);--->ArrayIndexOutOfBoundsException
        System.out.println(a.length);//5
        System.out.println(a[a.length-2]);//a[5-2]=40
        //System.out.println(a[a.length-6]);--->a[5-6]=>a[-1]-->ArrayIndexOutOfBoundsException
        
	}

}
