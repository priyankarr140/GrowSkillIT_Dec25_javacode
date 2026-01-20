package day6;
public class Program6_Fibonacci {
	static void fibonacci(int count)
	{
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2+" ");
		int i=1;
		while(i<=(count-2))
		{
			int num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
			i++;
		}		
	}
	public static void main(String[] args) {
		fibonacci(10);

	}

}
