package day6;

public class Program3_Swap {
	static void swap(int arr[])
	{
		int first=arr[0];//first=100
		int last=arr[arr.length-1];//last=500
		int temp=last;//temp=500
		last=first;//last=100;
		first=temp;//first=500;
		arr[0]=first;
		arr[arr.length-1]=last;
	}
		public static void main(String[] args) {
			int arr[]= {100,200,300,400,500,600,700,800};
			swap(arr);
			for(int i=0;i<=arr.length-1;i++)
				System.out.print(arr[i]+" ");
		}
	
}
