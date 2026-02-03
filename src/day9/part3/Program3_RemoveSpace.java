package day9.part3;
public class Program3_RemoveSpace {
	public static void main(String[] args) {
		String str="today is very cold";
		String newString="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			newString=newString+str.charAt(i);
		}
		System.out.println(newString);

	}

}
