package first_package;
//ASSERTION: Comparison between expected behaviour(By requirement) and actual behaviour (Behaviour of application) 
//assert is the keyword-Right click on assert-Rus as config-Argument-VM argument- -ea-Run
public class Assertion_Class {

	public static void main(String[] args) {
		/*int age=17;
		assert age>=18:"this line is not executed";
		System.out.println("the age is "+age);
		

	}

}*/
//output
/*Exception in thread "main" java.lang.AssertionError: this line is not executed
at first_package.Assertion_Class.main(Assertion_Class.java:7)*/
int age=180;//18 0r above 18 sys executed. 
assert age>=18:"this line is not executed";
System.out.println("the age is "+age);
//output : the age is 18
	}}
