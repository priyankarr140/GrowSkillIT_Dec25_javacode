package day7;
public class Program2_MethodOverloading {
	static void sum()
	{
		System.out.println(10);
	}
	static void sum(int num1,int num2)
	{
		System.out.println(num1+num2);
	}
	static void sum(int num1,float num2)
	{
		System.out.println(num1+num2);
	}	
	public static void main(String[] args) {
		sum();
		sum(10,20);
		sum(10,5.5F);

	}

}
