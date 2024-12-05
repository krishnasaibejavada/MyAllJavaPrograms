//Multilevel Inheritance
package first_package;
class Three//Super most class
{
	static void add1() {
		System.out.println("Arjun");
	}
}
class Two extends Three//Super class
{
	static void add2() {
		System.out.println("Sai");
	}
}
public class Multilevel_Inheritance1 extends Two {//child class or sub

	public static void main(String[] args) {
		add1();
		add2();
		

	}

}
