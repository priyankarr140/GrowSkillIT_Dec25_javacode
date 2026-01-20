package day8;
class ParentA
{
	String house;
}
class ChildA extends ParentA 
{
	String car;
}
class GrandChildA extends ChildA
{
	String bicycle;
	void print()
	{
		System.out.println(this.house);
		System.out.println(this.car);
		System.out.println(this.bicycle);
	}
}
public class Program4_Multilevel {
	public static void main(String[] args) {
		GrandChildA obj=new GrandChildA();
		obj.house="3BHK";
		obj.car="Creata";
		obj.bicycle="Hero";
		obj.print();

	}

}
