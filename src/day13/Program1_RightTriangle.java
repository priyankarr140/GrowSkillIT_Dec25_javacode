package day13;
public class Program1_RightTriangle {
	public static void main(String[] args) {
		int num=1;
		for(int row=1;row<=5;row++)
		{   //num=2
			//row=3 2<=5
			for(int col=1;col<=row;col++)
			{
				//col=1 2<=3
				System.out.print(num+" ");//1 
				                          //2 3
				num++;                    //4 5 6
			}
			System.out.println();
		}

	}

}
