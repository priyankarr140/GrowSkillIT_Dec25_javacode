package day12;
import java.util.*;
import java.util.Map.*;
public class Program1_Map {
	public static void main(String[] args) {
		Map<Integer,String>map=new TreeMap<Integer,String>();
		map.put(-4, "A");
		map.put(3, "C");
		map.put(2, "B");
		map.put(2, "D");
		System.out.println(map);
		map.remove(-4);
		System.out.println(map);
		System.out.println(map.get(3));
		System.out.println(map.keySet());
		for(Entry<Integer,String>e:map.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}

	}

}
