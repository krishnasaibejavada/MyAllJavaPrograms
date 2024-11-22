package first_package;
//Nested if else- Having the condition inside the condition.
public class Nested_If {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		if(a==b)//This first Parent if condition is false so it won't go child If condition., Directly executed Parent else block.
		{
		    {
			System.out.println("Sai");
				}
		     if(a!=b)//Child If condition.
		     {
			System.out.println("Likitha");
		      }
		     else
		     {
			System.out.println("Joshith");
		     }
		  }
		else//Parent else block.
		{
			System.out.println("Ravi");
		}

	}

}
