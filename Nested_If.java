package first_package;
//Nested if else- Having the condition inside the condition.
public class Nested_If {

	public static void main(String[] args) {
		//in nested if all the true statements will print.
		//for all child and sub child if conditions one else is enough
		int a=100;
		int b=100;
		if(a!=b)//This first Parent if condition is false so it won't go child If condition., Directly executed Parent else block.
		{
		   {
			System.out.println("Sai");
				}
		     if(a>=b)//Child If condition.
		     {
			System.out.println("Likitha");
		      }
		           if(a!=b)
		           {
		        	   System.out.println("I love you");
		           }
		           else
		           {
		        	   System.out.println("child else I hate you");
		           }
		  }
		else//Parent else block.
		{
			System.out.println("Parent else executed Ravi");
		}
		}
	}
