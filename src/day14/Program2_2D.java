package day14;

public class Program2_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int numB[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int numC[][]=new int[3][3];
		for(int i=0;i<numA.length;i++)
		{
			for(int j=0;j<numA[i].length;j++)
			{
				numC[i][j]=numA[i][j]+numB[i][j];
				System.out.print(numC[i][j]+" ");
			}
			System.out.println();
		}

	}

}
