/*Constructor: It is a special type of method.which doesn't have any return type
=>always non-static
=>constructor name always same as class name
=>it has any access specifier*/

package first_package;

	public class Sixth_Class {
	Sixth_Class()//(Constructor name) -non-static,no return type, package/default access specifier.
	{
	System.out.println("calling constructor 2");
    }
	
	public class Sixth_Class1 {
		Sixth_Class1()//(Constructor name) -non-static,no return type, package/default access specifier.
		{
		System.out.println("calling constructor 1");
		}
	}

	public static void main(String[] args) {
		Sixth_Class c1=new Sixth_Class();
		Sixth_Class1 s1=new Sixth_Class1();//1st syntax to call constructor (Just creation of object is enough to call a constructor).

		//If multiple constructors are present we need to create multiple object
		//new Sixth_Class();//2nd syntax to call constructor
		//new Seventh_Class();
		System.out.println("my first output");
		System.out.println("my second output");
		System.out.println("my third output");
	}
    }
	


