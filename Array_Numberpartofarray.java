package first_package;
//create a array size of 4 and check the number 50 is there in the array or not?
public class Array_Numberpartofarray {
	public static void main(String[] args) {
		int priya[]=new int[4];
		priya[0]=56;
		priya[1]=89;
		priya[2]=66;
		priya[3]=34;
		
		int numcheck=897;//check this is there or not
	
		for( int i=0;i<4;i++)
		{
			if(numcheck==priya[i])
			{
		        System.out.println(numcheck +" is present in the array of index position "+i);
			}
			if(numcheck!=priya[i])
			{
		        System.out.println("given number not present in the array");
		        //for the above if stmt number not matching but why output printing 2 times?
		        //given number not present in the array
		        //given number not present in the array
			}
			
		}
	}

}
