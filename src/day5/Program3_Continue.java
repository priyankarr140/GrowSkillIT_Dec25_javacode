package day5;
public class Program3_Continue {
	public static void main(String[] args) {
		System.out.println("hello");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				continue;
			System.out.print(i+" ");
		}
		System.out.println("\nBye");
	}

}
