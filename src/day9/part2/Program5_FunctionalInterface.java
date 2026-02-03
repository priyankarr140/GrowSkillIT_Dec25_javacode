package day9.part2;

@FunctionalInterface
interface IUser
{
	int sum(int a,int b);
	
}
public class Program5_FunctionalInterface {
	public static void main(String[] args) {
	 IUser obj=(a,b)->
	 {
		 return a+b;
	 };
	 System.out.println(obj.sum(10,20));
	 System.out.println(obj.sum(30,40));
	 

	}

}
