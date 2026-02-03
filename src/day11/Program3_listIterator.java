package day11;

import java.util.*;

public class Program3_listIterator {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4);
		Iterator<Integer>it=list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		ListIterator<Integer>it2=list.listIterator();
		System.out.println(it2.next());
		System.out.println(it2.next());
		System.out.println(it2.previous());


	}

}
