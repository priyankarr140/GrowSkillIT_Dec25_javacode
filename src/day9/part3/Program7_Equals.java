package day9.part3;
public class Program7_Equals {
	public static void main(String[] args) {
		String str1="hello";
		String str2="hello";
		String str3=new String("hello");
		String str4=new String("hello");
		if(str1==str2)
			System.out.println("one");
		if(str3==str4)
			System.out.println("two");
		if(str1.equals(str2))
			System.out.println("three");
		if(str3.equals(str4))
			System.out.println("four");
		str3.
		
		String str5="HELLO";
		String str6="hEllo";
		if(str5.equalsIgnoreCase(str6))
			System.out.println("equal value");

	}

}
