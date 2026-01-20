package day5;
public class Program2_break_while {
	public static void main(String[] args) {
		System.out.println("Hello");
		int num=1;
		while(num<=10)
		{
			System.out.print(num+" ");
			if(num==5)
				break;
			num++;
		}
		System.out.println();
		System.out.println("Bye");

	}

}
