package first_package;
//HUMAN INPUT AT THE RUN TIME TO CALL NON STATIC METHODS BY CREATING OBJECTS.
//FOR STATIC WE CAN CALL THE METHOD DIRECTLY BY USING METHOD NAME.
//with arguments only scanner class possible.
//Both global and local can have final declaration.ex: days in a week, month days, no of weeks in a month etc.
import java.util.Scanner;

public class Global_Variables {
 //static int a;//by default it will global value based on data type is i.e 0.
//static int b=200;//if we declare global also but it will take local values only

	
	static void add(int a,int b) //direct can call by using main method name
{
	int sum=a+b;
	System.out.println("sum is" + sum);
}
    
 void sub(int a, int b)//need to create an object to call non-static method.
{
	int sub=a-b;
	System.out.println("sub is" + sub);
}
	
	public static void main(String[] args) 
	{
	    System.out.println("execution starting from the main method");
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a value");
		int a=s1.nextInt();
		System.out.println("enter b value");
		int b=s1.nextInt();
		add(a, b);//static method
		Global_Variables g1=new Global_Variables();
        g1.sub(a, b);//non-static method that'y created object and by using ref variable we called the method.
       
	}
}

//DEfault value of each datatype incase they are Global variable.
/*double=0.0;
byte=0;
short=0;
int=0;
long=0
float=0.0
char=not defined//nothing will print.
boolean=false;
String=Null;*/