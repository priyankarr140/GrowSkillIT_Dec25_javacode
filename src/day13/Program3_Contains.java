package day13;

public class Program3_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="12hellobye";
		String regex=".*hello.*";
		
		if(str.matches(regex))
			System.out.println("MATCHES");
		else
			System.out.println("DOESNT MATCH");

	}

}
