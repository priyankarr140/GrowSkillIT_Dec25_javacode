package day12;

import java.util.HashMap;

public class Program2_RepetitionWords {
	public static void main(String[] args) {
		String str="the day today is a very very very cold day";
		String[]words=str.split(" ");
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		for(String word:words)
		{
			if(map.containsKey(word))
			{
				int value=map.get(word);
				value=value+1;
				map.put(word, value);
			}
			else	
				map.put(word, 1);
		}
		System.out.println(map);
	}

}
