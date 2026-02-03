package day10;
public class Program5_SumOfNumbers {
	public static void main(String[] args) {
		String str="Hello12Bye3";
		int sum=0;
		String temp="0";
		for(int i=0;i<str.length();i++)
		{
			char alpha=str.charAt(i);
			if(Character.isDigit(alpha))
			{
				temp=temp+alpha;//0300
			}
			else
			{
				int num=Integer.parseInt(temp);//12
				sum=sum+num;//12
				temp="0";
			}
		}
		System.out.println(sum+Integer.parseInt(temp));

	}

}
