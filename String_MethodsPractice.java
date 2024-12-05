package first_package;
//String methods
public class String_MethodsPractice {
	public static void main(String[] args) {
		String a="Ramcharan";
		int b=a.length();
		System.out.println(b);
		
	String c=a.toUpperCase();
	System.out.println(c);
	
	String d=a.toLowerCase();
	System.out.println(d);
	
char e=a.charAt(5);//where index of  the exact character is in the String, 5 means position of the character.
System.out.println(e);

System.out.println(a.isEmpty());//check string is empty or not 
String f="Upasana";
String g=a.concat(f);
//combine two strings
System.out.println(g);


String h="  hello dears  ";//remove the space beginning and end of the string not in middle.
System.out.println(h.trim());
	}

//output
	/*9
	RAMCHARAN
	ramcharan
	a
	false
	RamcharanUpasana
	hello dears*/ //trim the spaces of string beg and end


}
