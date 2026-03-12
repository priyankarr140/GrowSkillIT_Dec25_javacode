package day13;
public class Program3_MatrixAddition {
	public static void main(String[] args) {
		//int [][]numA=new int[3][3];
		int[][]numA= {{1,2,3,0},{4,5,6,0},{7,8,9,0}};
		int [][]numB= {{10,20,30,0},{40,50,60,0},{70,80,90,0}};
		int [][]sum=new int[3][4];
		for(int i=0;i<=numA.length-1;i++)
		{
			for(int j=0;j<=numA[i].length-1;j++)
				{sum[i][j]=numA[i][j]+numB[i][j];
				   System.out.print(sum[i][j]+" ");
				}
			System.out.println();
		}
	}

}
