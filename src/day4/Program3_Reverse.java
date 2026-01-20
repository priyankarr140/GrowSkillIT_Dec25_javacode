package day4;
public class Program3_Reverse {
	public static void main(String[] args) {
		
		int num=1221;
		int originalNum=num;
		System.out.println(num);
		int reverse=0;
		//int counter=4;
		while(num>0)
		{
			int lastDigit=num%10;//9
			reverse=reverse*10+lastDigit;//70+8=780+9=789
			System.out.println(reverse);
			num=num/10;
			//counter--;
		}
		if(originalNum==reverse)
			System.out.println("Palindrome");
	

	}

}
