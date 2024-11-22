package first_package;

//Method overloading : Developing multiple methods with same name but diff in the arguement list.

public class Fifth_Class {
	
	static void add(int a,int b){//call static method in main method
	int sum=a+b;
	{
	System.out.println("addition is "+sum);
	}
	}
	static void add(int c,double d) {
	double sub=c-d;
	{
	System.out.println("sub is "+sub);
	}
	}
	public static void main(String[] args) {
		add(2,5);//line by line execution happens.
		add(7,4.59999);
	}

}
