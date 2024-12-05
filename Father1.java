package first_package;

public class Father1 {

	Father1() {
		this("Krishna");
		
		System.out.println("calling child class Ganesh");
	}

	Father1(String a) {
		this(12);
		System.out.println("String constructor: " + a + "calling Mother Parvathi");
	}

	Father1(int a) {
		System.out.println("Int constructor: " + a);
	}
	
	public static void main(String[] args) {
		Father1 f1=new Father1();//Object creation for non static methods in constructors.
		System.out.println("Last line");
	}
}
