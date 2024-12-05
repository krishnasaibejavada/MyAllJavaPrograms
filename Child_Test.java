//METHOD OVERRIDING= developing a method in parent class with the same name and signature with the child class but differ in the implementation(method body).
package first_package;
class Parent_Test
{
	void login()
	{
		System.out.println("login by using email");//implementation
	}
	
}
class SubParent_Test extends Parent_Test
{
	void login()
	{
		super.login();//Super key word is used in the case of method overriding to call the Parent class execute or implement with the child class  together
		System.out.println("login by using password");
	}
}
public class Child_Test extends SubParent_Test {
	void login()
	{
		super.login();//by using super keyword only parent class executing.
		System.out.println("login by using both email and pwd");
	}

	public static void main(String[] args) {
Child_Test c1=new Child_Test();
c1.login();
	}

}
//OUT PUT
/*login by using email
login by using password
login by using both email and pwd*/
