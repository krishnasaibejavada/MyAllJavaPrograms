/*Constructor: which doesn't have return type
=>always non-static
=>constructor name always same as class name
=>it has any access specifier*/

package first_package;
public class Sixth_Class {
	Sixth_Class()//(Constructor name) -non-static,no return type, package/default access specifier.
	{
		System.out.println("output");
	}

	public static void main(String[] args) {
		Sixth_Class s1=new Sixth_Class();//1st syntax to call constructor (Just creation of object is enough to call a constructor).
		new Sixth_Class();//2nd syntax to call constructor
		
		System.out.println("my first output");
		System.out.println("my second output");
		System.out.println("my third output");
	}

}
