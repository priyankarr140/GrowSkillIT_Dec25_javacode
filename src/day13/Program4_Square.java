package day13;
public class Program4_Square {
	public static void main(String[] args) {
		String str="enew";
		String regex="^[abce].*";
		
		if(str.matches(regex))
			System.out.println("MATCHES");
		else
			System.out.println("DOESNT MATCH");

	}

}
