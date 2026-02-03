package day9.part3;
public class Program4_COuntWords {
	public static void main(String[] args) {
		String str="today is very cold";
		int sp=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				sp++;
		}
		System.out.println(sp+1);
		System.out.println(str.split(" ").length);
	}

}
