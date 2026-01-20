package day5;

public class Program6_LocalGlobal {

	static int num3=10;
	static void methodA(int num1)
	{
		System.out.println(num1+num3);
	}
	static void methodB(int num2)
	{
		System.out.println(num2+num1+num3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
