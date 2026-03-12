package day13;

public class Program2_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//STARTS WITH HELLO
		String str="hellonew";
		String regex="^hello.*";
		
		if(str.matches(regex))
			System.out.println("MATCHES");
		else
			System.out.println("DOESNT MATCH");

	}

}
