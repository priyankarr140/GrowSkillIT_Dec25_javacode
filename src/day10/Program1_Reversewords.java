package day10;
public class Program1_Reversewords {
	public static void main(String[] args) {
		String name = "today is cold day";
		// yadot si a dloc yad
		String[] words = name.split(" ");
		//String[]words= {"today","is","cold","day"};

		StringBuilder reverseString=new StringBuilder();
		for(String word:words)
		{
			   StringBuilder sb=new StringBuilder(word);
			   reverseString.append(sb.reverse());
			   reverseString.append(" ");
		}
		System.out.println(reverseString);
		

		}

	}


