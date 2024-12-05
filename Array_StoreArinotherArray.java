package first_package;

import java.util.Arrays;

public class Array_StoreArinotherArray {

	public static void main(String[] args) {
		int learn1[]=new int[4];
		learn1[0]=43;
		learn1[1]=90;
		learn1[2]=85;
		learn1[3]=55;
		
		int learn2[]=new int[4];
		for(int i=0;i<4;i++)//i is index position
		{
			learn2[i]=learn1[i];//assigning learn1[0]-(right hand side) value to the learn2[0]-(lest hand side)
		}
		System.out.println(Arrays.toString(learn2));
		System.out.println(Arrays.toString(learn1));	
	}

}//OUTPUT  [43, 90, 85, 55]
//         [43, 90, 85, 55]
