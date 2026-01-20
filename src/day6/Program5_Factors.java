package day6;

public class Program5_Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12;
		for(int fact=1;fact<=num;fact++)
		{
			if(num%fact==0)
				System.out.print(fact+" ");
		}

	}

}
