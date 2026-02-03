package day11;
import java.util.*;
public class Program1_List {
	interface ITestList
	{
		void add();
		void remove();
	}
	class TestArrayList implements ITestList
	{
		public void add() {
			
		}
		public void remove()
		{
			
		}
	}
	static void insert(List<Integer>data)
	{
		
	}
	public static void main(String[] args) {
		
		List<Integer>listA=new ArrayList<Integer>();
		List<Integer>listC=new Vector<Integer>();
		insert(listA);
		insert(listC);

		listA.add(10);
		listA.add(20);
		listA.add(30);
		System.out.println(listA);
		ArrayList<Integer>listB=new ArrayList<Integer>();
		listB.add(40);
		listB.add(50);
		listA.addAll(listB);
		System.out.println(listA);
		System.out.println("contains:"+listA.contains(60));
		System.out.println("index:"+listA.indexOf(10));
		System.out.println("size:"+listA.size());
		System.out.println("get 0 th element:"+listA.get(0));
		listA.remove(0);
		listA.add(0, 1000);
		System.out.println(listA);
		listA.set(0, 100);
		System.out.println(listA);
		System.out.println("Is Empty:"+listA.isEmpty());
		
		for(int num:listA)
			System.out.print(num+" ");
		





		
		

	}

}
