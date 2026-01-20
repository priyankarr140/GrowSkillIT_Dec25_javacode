package day4;

public class Program2_CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int num=98765;
		//5*10+6
		while(num>0)
		{
			
			num=num/10;//0
			count++;//5
		}
		System.out.println(count);

	}

}
