package first_package;
//Program to count the alphabets, numerics,spaces and special char in a given string.
import java.util.Arrays;

public class Array_Countall {
static int count_of_alphabet;
static int count_of_numeric;
static int count_of_space;
static int p;


	public static void main(String[] args) {
		String s1="kv no 2 bangalore";//step 1 need to store this in Array
		char c1[]=s1.toCharArray();
		System.out.println(Arrays.toString(c1));//o/p [k, v,  , n, o,  , 2,  , b, a, n, g, a, l, o, r, e]
		
		for(int i=0;i<s1.length();i++)
		{
		   boolean b1=Character.isAlphabetic(c1[i]);
		   if(b1==true)
		  {
			count_of_alphabet++;			                                      //      13
		  }
		   boolean b2=Character.isDigit(c1[i]);
		   if(b2==true)
		  {
			count_of_numeric++;
		  }
		   boolean b3=Character.isWhitespace(c1[i]);
		   if(b3==true)
		  {
			count_of_space++;
		  }
		   int p=s1.length()-(count_of_alphabet+count_of_numeric+count_of_space);
	    
		}
		
		System.out.println("the count of alphabet is "+count_of_alphabet);//o/p
		System.out.println("the count of numeric is "+count_of_numeric);//o/p: 
		System.out.println("the count of space is "+count_of_space);//o/p: 
		System.out.println("the count of special char is "+p);//o/p: 

}
}
//output
/*the count of alphabet is 13
the count of numeric is 1
the count of space is 3
the count of special char is 0*/
