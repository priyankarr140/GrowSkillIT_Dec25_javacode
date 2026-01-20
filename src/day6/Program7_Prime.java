package day6;
public class Program7_Prime {
	static void isPrime(int num)
	{
		if(num==1)
			System.out.println("Neither prime nor composite");
		else if(num==2)
			System.out.println("Prime");
		else if(num%2==0)
			System.out.println("Not prime");
		else
		{
			boolean flag=true;
			for(int fact=3;fact<num;fact=fact+2)
			{
				if(num%fact==0)
				{
					flag=false;
					System.out.println("Not a prime");
					break;
				}					
			}
			if(flag==true)
				System.out.println("Prime");					
		}
	}
	public static void main(String[] args) {
		isPrime(9);

	}

}
