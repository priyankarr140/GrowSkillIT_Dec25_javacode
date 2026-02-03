package day10;

public class Program4_SumOfDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello12Bye3";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char alpha=str.charAt(i);
			if(Character.isDigit(alpha))
			{
				sum=sum+Integer.parseInt(alpha+"");
			}
		}
		System.out.println(sum);

	}

}
