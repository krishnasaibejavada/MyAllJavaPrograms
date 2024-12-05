package first_package;
abstract class Parent1
{
	abstract void method1();//abstract methods
	abstract void method2();//abstract methods
	void method6() {
		System.out.println("Love u");

		}
}
abstract class Parent2 extends Parent1
{
	abstract void method3();//abstract methods
	abstract void method4();//abstract methods
    void method1() {
	System.out.println("Ravan");

	}

	
	void method2() {
		System.out.println("Laxman");

	}
}
public class Abstract_Class1 extends Parent2 {//concrete class or child class having implementation in it(method body).

	public static void main(String[] args) {
		Abstract_Class1 a1=new Abstract_Class1();
		a1.method3();
		a1.method4();
		a1.method1();
		a1.method2();
		a1.method6();

	}

	
	void method3() {
		System.out.println("Ram");

	}

	
	void method4() {
		System.out.println("Sita");

	}

	
	//concrete methods
}	


