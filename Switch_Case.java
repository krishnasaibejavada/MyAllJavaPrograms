package first_package;
import java.util.Scanner;
public class Switch_Case {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in); 	//We can give human input at run time by using Scanner class also.
		 System.out.println("pls enter 1 for chrome");
		  System.out.println("pls enter 2 for edge");
		  System.out.println("pls enter 3 for safari");
		  System.out.println("pls enter 4 for firefox");
		int input=s1.nextInt();
		
		switch(input) 
		/*switch(1)*/
		//input in program itself
		{
		case 1: System.out.println("Launch chrome ");//action
		break;//THere is no break all continuous cases executed 
		case 2: System.out.println("Launch edge ");
		break;
		case 3: System.out.println("Launch Safari ");
		break;
		case 4: System.out.println("Launch Firefox ");
		break;
		default:System.out.println("your selectionis wrong pls try again");

	}
		
	}

}
