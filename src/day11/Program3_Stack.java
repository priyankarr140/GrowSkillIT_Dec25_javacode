package day11;
import java.util.*;
public class Program3_Stack {
	public static void main(String[] args) {
		String str="[[[[]]]";
		boolean balance=true;
		Stack<Character>stack=new Stack<Character>();
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='[')
				stack.push(str.charAt(i));
			else
			{
				//]
				if(!stack.isEmpty())
					stack.pop();
				else
				{
					balance=false;
					System.out.println("More closing brackets");
					break;
				}
			}
		}
		
		if(balance && stack.isEmpty())
			System.out.println("Balanced");
		else if(!stack.isEmpty())
			System.out.println("More opening brackets");
		
		

	}

}
