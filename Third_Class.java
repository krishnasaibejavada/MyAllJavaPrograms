package first_package;

public class Third_Class {
	
	static void method1()//call static method in main method
	{
	System.out.println("Joshith");
	}
	static void method2()
	{
	System.out.println("Likitha");
	}
	void nonstatic_method1()//call non-static method in a main method.
	{
	System.out.println("Prasad");
	}
	void nonstatic_method2()//call non-static method in a main method.
	{
	System.out.println("Sai");
	}
	public static void main(String[] args) {
		method1();//line by line execution happens.
		method2();
		Third_Class r1=new Third_Class();//object creation by using class name for calling non-static methods in main method (r1 is ref variable)
		r1.nonstatic_method1();
		r1.nonstatic_method2();//No need to create objects all the time we can use same object for multiple methods.

	}

}
/*output
Joshith
Likitha
Prasad
Sai*/
