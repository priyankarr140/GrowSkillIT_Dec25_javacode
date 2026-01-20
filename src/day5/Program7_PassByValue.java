package day5;
public class Program7_PassByValue {
	 static int incByFive(int num2)
	    {
	    	int ans=num2+5;
	    	return ans;
	    }
	public static void main(String[] args) {
		int num= 10;
		int result=incByFive(num);
		System.out.println(result);
		System.out.println(num);


	}

}
