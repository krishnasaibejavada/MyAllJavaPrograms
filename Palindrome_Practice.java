package first_package;
//PALINDROME
//STEPS

//1.declare  string value.
//2. reverse a string by using charAt() and store this in another string
//3.compare the reverse string and normal string if it is equal it is a palindrome otherwise not.

public class Palindrome_Practice {
	public static void main(String[] args) {
		String a="malayalam";
		String output="";
		//int i=a.length();
		//System.out.println(i);
		for(int i=a.length()-1;i>=0;i--)
		{
			char c1=a.charAt(i);
			output=output+c1;
		}
			System.out.println(output);
		boolean b1=a.equals(output);
		if(b1==true)
			//if(a==output) can we use this without boolean condition i have a doubt????????????????????????????????????????????????????????????????
		{
				System.out.println("It is a palindrome");
			}
			else
			{
				System.out.println("It is not a palindrome");
			}
		}
}
	
		/*System.out.println(output);
		if(a==output)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		//another logic
		/*boolean b1=a.equals(output);
		if(b1==true)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}*/
		/*a.charAt(2);
		a.charAt(1);
		a.charAt(0);
		System.out.println(a.charAt(2));
		System.out.println(a.charAt(1));
		System.out.println(a.charAt(0));*/


		
	


