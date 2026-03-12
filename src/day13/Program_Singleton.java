package day13;
class UserM
{
	static UserM obj;
	
	private UserM()
	{
		
	}
	private String name;
	static UserM getObj()
	{
		if(obj==null)
			obj=new UserM();
		return obj;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
	    this.name=name;
	}
}
public class Program_Singleton {
	public static void main(String[] args) {
		UserM a=UserM.getObj();
		UserM b=UserM.getObj();
		if(a==b)
			System.out.println("SAME OBJECT");
		   a.setName("Rahul");
		   System.out.println(b.getName());
		

	}

}
