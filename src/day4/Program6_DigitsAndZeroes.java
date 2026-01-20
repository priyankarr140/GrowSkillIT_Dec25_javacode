package day4;
public class Program6_DigitsAndZeroes {
	public static void main(String[] args) {
		int num=100;
		int originalNum=num;
		int countDigit=0;
		int result=0;
		int multiplier=10;
		
		while(num>0)
		{
			countDigit++;
			num=num/10;	
		}
		if(countDigit==1)
		{
			result=originalNum*10;
		}
		else if(countDigit==2)
		{
			result=originalNum*100;
		}
		else
		{
			result=originalNum;
		}
		System.out.println(originalNum*multiplier);
		

	}

}
