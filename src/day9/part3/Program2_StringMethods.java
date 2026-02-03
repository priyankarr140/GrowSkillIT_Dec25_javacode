package day9.part3;
public class Program2_StringMethods {
	public static void main(String[] args) {
		String str="Hello world program";
		System.out.println(str.replace(' ', '-'));
		System.out.println(str.concat(" example"));
		System.out.println(str.charAt(0));
		System.out.println(str.contains("or"));
		System.out.println(str.indexOf('e'));
		System.out.println(str.length());
		System.out.println(str.toUpperCase());

		String str2="         hello all      ";
		System.out.println(str2.trim());	
		//String[]words=str.split(" ");
		//{"Hello","world","program"}
		System.out.println(str.split(" ")[1]);
	    System.out.println(str.substring(12,15));
		
		String str3=9+"";
		str3=9.5+"";//"9.5"
		System.out.println(str3.charAt(1));
		String str4="today is very cold";
		System.out.println(str4.replace(" ",""));
	}

}
