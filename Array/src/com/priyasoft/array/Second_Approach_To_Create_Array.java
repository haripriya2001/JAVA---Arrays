package com.priyasoft.array;

public class Second_Approach_To_Create_Array {

	public static void main(String[] args) {
		int[] b = new int[5];//size is mandatory
	    b[0]=1;
	    b[1]=2;
	    b[2]=3;
	    b[3]=3;
	    b[4]=4;
	    for(int x: b)
	    {
	    	System.out.println(x);
	    }
	    System.out.println();
	    
	    float[] c = new float[5];
	    c[0]= 1.0f;
	    c[1]= 2f;// it prints 2.0
	    c[2]= 6.2222222f;// after dot 7 values are allowed in float
	    c[3]= 7.222222222222222222222f;
	    //c[4]= 0f;---> if c[4] is not initialized, it takes default value of the given datatype
	    for(float y: c)
	    {
	    	System.out.println(y);
	    }
	}

}
