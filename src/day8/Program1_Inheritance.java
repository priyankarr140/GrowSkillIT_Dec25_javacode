package day8;
class User
{
	int userId;
	String userName;
	User()
	{
		System.out.println("I am user");
	}
}
class Children extends User
{
	String favColor;
	Children()
	{
		System.out.println("I am children");
	}
}
public class Program1_Inheritance {
	public static void main(String[] args) {
		Children userA=new Children();
		TestAccess obj=new TestAccess();
		obj.getPrivateNum();
		obj.defaultNum=10;

	}

}
