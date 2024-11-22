package first_package;
//CONTINUE KEYWORD: to skip the any iteration in between it is used.
public class Continue_Class {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==4)//4 in output is skipped
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
//OUT PUT
/*1
2
3
5
6
7
8
9
10*/