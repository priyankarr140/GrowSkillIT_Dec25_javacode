package day9.part2;
abstract class Collection_
{
	static int num;
	final int num2=10;
	Collection_()
	{
		System.out.println("i am constructor");
	}
	static void remove()
	{
		//remove
	}
	 abstract void add();
}
class List_ extends Collection_
{
	void add()
	{
		//add sequential
	}
}
class Set_ extends Collection_
{
   
	void add()
	{
		//no duplicate
	}
}

public class Program1_Collection {
	public static void main(String[] args) {
		
		List_ list=new List_();
	}

}
