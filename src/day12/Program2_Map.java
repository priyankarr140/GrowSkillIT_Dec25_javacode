package day12;
import java.util.*;
public class Program2_Map {
	public static void main(String[] args) {
		String str="aaabbc";
		StringBuilder sb=new StringBuilder();
		String output="";
		Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				int value=map.get(str.charAt(i));
				value++;
				map.put(str.charAt(i), value);
			}
			else map.put(str.charAt(i), 1);
		}
		for(Map.Entry<Character,Integer>e:map.entrySet())
		{
			sb.append(e.getKey()).append(e.getValue());
		}
		output=sb.toString();
		System.out.println(output);

	}

}
