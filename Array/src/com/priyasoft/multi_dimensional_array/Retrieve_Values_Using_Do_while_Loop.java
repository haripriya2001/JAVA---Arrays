package com.priyasoft.multi_dimensional_array;

public class Retrieve_Values_Using_Do_while_Loop {

	public static void main(String[] args) {
		int[][] a={{-1,-1,-1},{-1,-2},{-1,-2,-3}};
		int i=0;
		do{
			int j=0;
			do{
		     System.out.print(a[i][j]+"  ");
		     j++;
			}while(j<a[i].length);
			i++;
			System.out.println();
		}while(i<a.length);

	}

}
