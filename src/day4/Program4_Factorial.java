package day4;
public class Program4_Factorial {
	public static void main(String[] args) {
		int fact=1;
		int num=5;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
			
		int num=1221;

		System.out.println(num);
		int reverse=0;
		while(num>0)
		{
			int lastDigit=num%10;//9
			reverse=reverse*10+lastDigit;//70+8=780+9=789
			num=num/10;
			//counter--;
		}
		

	}

}
