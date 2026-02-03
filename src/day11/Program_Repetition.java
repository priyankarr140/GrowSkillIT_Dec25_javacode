package day11;
import java.util.*;
public class Program_Repetition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="the day today is a very very very cold day";
		StringBuilder output=new StringBuilder();
		String[]words=str.split(" ");
		Set<String>setA=new LinkedHashSet<String>();
		for(String word:words)
		{
			setA.add(word);
		}
		for(String word:setA)
		{
			output.append(word).append(" ");
		}
		String result=output.toString().trim();
		System.out.println(result);
		

	}

}
