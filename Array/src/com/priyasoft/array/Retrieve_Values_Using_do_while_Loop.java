package com.priyasoft.array;

public class Retrieve_Values_Using_do_while_Loop {

	public static void main(String[] args) {
		int[] a={12,20,18,2,13,29,49};
		int i=0;
		do{
			System.out.println(a[i]);
			i++;
		}while(i<a.length);
		System.out.println();
		
		//printing in reverse
		
		int j=a.length;
		do{
			System.out.println(a[j-1]);
			j--;
		}while(j>0);
		

	}

}
