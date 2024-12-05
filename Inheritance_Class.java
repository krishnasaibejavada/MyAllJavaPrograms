//SIngle level Inheritance
//For static methods
package first_package;
class One {//Super or Parent class
	static void mul()
	{
		System.out.println("mul");

		}

	static void div()
	{
		System.out.println("div");

		}
}
public class Inheritance_Class extends One {//sub or child class , it have main method.
	static void add() 
	{
		System.out.println("add");
	}

	static void sub()
	{
		System.out.println("sub");
		}

	public static void main(String[] args) {
		
		mul();
		div();
		add();
		sub();

	}
}

//======================================= for non-static methods.
/*package first_package;
class One {//Super or Parent class
	 void mul()
	{
		System.out.println("mul");

		}

	 void div()
	{
		System.out.println("div");

		}
}
public class Inheritance_Class extends One {//sub or child class , it have main method.
	 void add() 
	{
		System.out.println("add");
	}

	 void sub()
	{
		System.out.println("sub");
		}

	public static void main(String[] args) {
		Inheritance_Class i1=new Inheritance_Class();
		
		i1.mul();
		i1.div();
		i1.add();
		i1.sub();

	}
*/












