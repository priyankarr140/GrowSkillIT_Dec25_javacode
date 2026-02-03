package day11;
import java.util.*;
public class Program4_Set {
	public static void main(String[] args) {
		Set<Integer>setA=new LinkedHashSet<Integer>();
		setA.add(40);
		setA.add(10);
		setA.add(10);
		setA.add(20);
		setA.add(30);
		System.out.println(setA);
		for(int num:setA)
			System.out.print(num+" ");
		System.out.println();
		Iterator<Integer>it=setA.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");

	}

}
