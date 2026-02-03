package day9.part3;
public class Program5_Palindrome {
	public static void main(String[] args) {
		String str="toot";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
			reverse=reverse+str.charAt(i);
		
		if(reverse.equals(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		
		
		

	}

}
