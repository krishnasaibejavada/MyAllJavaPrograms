package first_package;

public class Fourth_Class {
	
	static void add() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("addition is "+c);
	}
	void method2(int a,int b){
		System.out.println("Likitha");
		}

	public static void main(String[] args) {
		Fourth_Class f1=new Fourth_Class();
		f1.method2(1,2);
		add();
		
	}

}

//for parameterized methods do we need to pass the values from main mentod only :no ???????????????????????????????????????

//ANS: we can pass directly from method
