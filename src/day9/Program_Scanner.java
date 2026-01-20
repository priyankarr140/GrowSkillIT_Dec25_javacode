package day9;
import java.util.*;
public class Program_Scanner {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		System.out.println(num);
		String str=scanner.next();
		System.out.println(str);
		float marks=scanner.nextFloat();
		System.out.println(marks);
		boolean result=scanner.nextBoolean();
		System.out.println(result);
		char alpha=scanner.next().charAt(0);
		System.out.println(alpha);
		scanner.nextLine();
		String line=scanner.nextLine();
		System.out.println(line);
		scanner.close();


	}

}
