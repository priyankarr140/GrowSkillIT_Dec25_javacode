package day4;
public class Program7_Odd_Zero {
	public static void main(String[] args) {
		int num=5678;
		//output=5070
		//5000+70
		//[index 4]*1000 +[index 2*10]
		int newNum=0;
		int count=0;
		while(num>0)
		{
			count++;
			int lastDigit=num%10;
			if(count==2)
				newNum=lastDigit*10+newNum;
			else if(count==4)
				newNum=lastDigit*1000+newNum;
			num=num/10;
		}
		System.out.println(newNum);
		
	}

}
