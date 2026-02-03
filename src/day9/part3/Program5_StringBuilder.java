package day9.part3;

public class Program5_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("hello");
		sb.append(" world");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuffer sf=new StringBuffer();
		sf.reverse();
		
		//STRINGBUFFER IS THREAD SAFE
		

	}

}
