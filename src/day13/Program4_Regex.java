package day13;

public class Program4_Regex {

	public static void main(String[] args) {
		//3-6 characters
		//_ is optional
		//2digit or 3 digit number
		//@infosys.com
		String str="1aaa109@infosys.com";
		String regex="^[a-zA-Z]{3,6}_?[0-9]{2,3}@infosys.com$";
		//END WITH @infosys.com
		//String regex2="@infosys.com$";
		//String str2="hello@infosys.com";
		if(str.matches(regex))
			System.out.println("MATCHES");
		else
			System.out.println("DOESNT MATCH");

	}

}
