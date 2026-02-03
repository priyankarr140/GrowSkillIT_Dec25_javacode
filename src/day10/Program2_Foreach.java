package day10;
public class Program2_Foreach {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		for(int data:arr)
		{
			System.out.print(data+" ");
		}
		System.out.println();
		String[]words= {"today","is","a","cold","day"};
		for(String str:words)
		{
			System.out.print(str+" ");
		}
		

	}

}
