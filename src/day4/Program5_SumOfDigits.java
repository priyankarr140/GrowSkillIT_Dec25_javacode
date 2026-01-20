package day4;

public class Program5_SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int sum=0;
		while(num>0)
		{
			int lastDigit=num%10;
			sum=sum+lastDigit;
			num=num/10;
		}
		System.out.println(sum);

	}

}
