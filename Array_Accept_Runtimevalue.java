package first_package;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Accept_Runtimevalue {

	public static void main(String[] args) {
		
    int rollno[]=new int[5];//array size=5

    Scanner s1=new Scanner(System.in);
    for(int i=0;i<=4;i++)
    {
    	rollno[i]=s1.nextInt();
    }
    System.out.println(Arrays.toString(rollno));
    
    //output, input given at the run time.
    /*60
80
89
[30, 40, 60, 80, 89]*/

    /*rollno[0]=s1.nextInt(); instead of these all we use for loop
    rollno[1]=s1.nextInt();

    rollno[2]=s1.nextInt();

    rollno[3]=s1.nextInt();

    rollno[4]=s1.nextInt();*/


	}


}
