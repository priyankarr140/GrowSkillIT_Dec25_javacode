package day5;
public class Program5_Methods {
    static boolean  checkEven(int num)
    {
    	if(num%2==0)
    		return true;
    	else
    		return false;
    }
    static void incByFive(int num)
    {
    	int ans=num+5;
    	System.out.println(ans);
    }
	public static void main(String[] args) {
		boolean result1=checkEven(13);
		boolean result2=checkEven(12);
		System.out.println(result1);
		System.out.println(result2);
		incByFive(25);


	}

}
