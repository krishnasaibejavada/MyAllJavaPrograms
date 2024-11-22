//Constructor Overloading: Developing multiple constructors with same name but variation in the arg list.
package first_package;

public class Seventh_Class {
	Seventh_Class()//constructor (constructor name same as class name)
	{
		System.out.println("constructor output no arguments");
	}
	Seventh_Class(int a)
	{
		System.out.println("constructor output with one argument");
	}
	Seventh_Class(int a, char b)
	{
		System.out.println("constructor output with two arguments");
	}
	public static void main(String[] args) {
		//Seventh_Class s1=new Seventh_Class(); s1,s2,s3 are local variables. (we can't use same variable)
		//Seventh_Class s2=new Seventh_Class(10);
		//Seventh_Class s3=new Seventh_Class(20,'r');
		
		new Seventh_Class();
		new Seventh_Class(10);
		new Seventh_Class(20,'r');

	}

}
