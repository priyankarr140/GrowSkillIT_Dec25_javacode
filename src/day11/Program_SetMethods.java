package day11;
import java.util.*;
public class Program_SetMethods {
	public static void main(String[] args) {
		Set<Integer>setA=new HashSet<Integer>();
		setA.add(10);
		setA.add(20);
		setA.add(30);
		Set<Integer>setB=new HashSet<Integer>();
		setB.add(30);
		setB.add(40);
		setB.add(50);
		Set<Integer>intersection=new HashSet<Integer>(setA);
		intersection.retainAll(setB);
		System.out.println(intersection);
		Set<Integer>difference=new HashSet<Integer>(setA);
		difference.removeAll(setB);
		System.out.println(difference);
		Set<Integer>union=new HashSet<Integer>(setA);
		union.addAll(setB);
		System.out.println(union);
				
		

		

	}

}
