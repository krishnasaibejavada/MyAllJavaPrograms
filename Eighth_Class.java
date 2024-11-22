//Accepting the Human input at run time -using scanner cls it is possible.
package first_package;
import java.util.Scanner;
public class Eighth_Class {

	public static void main(String[] args) {//Scanner is a predefined class in java, It present in "java.util"paclage
		Scanner s1=new Scanner(System.in);//System is a class that comes from "java.lang" package,system.in means -Accepting the input
		
		System.out.println("Enter the value of a");//System.out --giving the output.
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("Sum of a,b "+sum);
		
		//____________________________________________
		System.out.println("Enter Byte value ");
		byte b1=s1.nextByte();//only accepts input from -127 to +127, if we give 200 input it throws input Mismatch exception.

//METHODS OF SCANNER CLASS---To accept the values at run time these methods will be used.

		//String a=s1.next();
		//int b=s1.nextInt();
		//float c=s1.nextFloat();
		//boolean d=s1.nextBoolean();
		//s1.nextByte();
		//s1.nextLong();
		//s1.nextShort();

	
	}

}
