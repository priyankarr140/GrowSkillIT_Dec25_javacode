package day3;

public class Program6_IfLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		while(num<=60)
		{
			if(num%15==0)
				System.out.println("Hello");
			else if(num%20==0)
				System.out.println("Bye");
			else
				System.out.println(num);
			num=num+5;
			
		}

	}

}
