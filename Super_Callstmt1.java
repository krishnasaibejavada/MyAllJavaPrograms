package first_package;
//NOTE:If the constructor is parameterized we need to go explicitly mention the super class with the parameters.
//super calling stmt is always be the first line for all constructor.
//defined in two ways implicitly (no need to mention it), Explicitly (need to mention it for parameterized constructors)
class Mother
{
	Mother()
{
	//super();//implicitly it will present by default
	System.out.println("calling Mother Parvathi");
}
}
class Father extends Mother
{
	Father(int a)//Parameterized constructor
{
		//super();//implicitly it will present by default
	System.out.println(a);
}
}
public class Super_Callstmt1 extends Father {
Super_Callstmt1()
{
	super(10);//Parameterized super calling method
	System.out.println("calling child class Ganesh");
}
	public static void main(String[] args) {
		Super_Callstmt1 s1=new Super_Callstmt1();//Object creation for non static methods in constructors.

	}

}
