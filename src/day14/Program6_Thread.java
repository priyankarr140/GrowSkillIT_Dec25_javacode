package day14;
class MyThreadA extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().threadId());
	}
}
public class Program6_Thread {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			MyThreadA t1=new MyThreadA();
			t1.start();
		}
	}

}
