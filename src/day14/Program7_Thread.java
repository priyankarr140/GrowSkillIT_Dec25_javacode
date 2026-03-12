package day14;
class MyThreadB implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getId());
	}
}
public class Program7_Thread {
	public static void main(String[] args) {
  for(int i=1;i<=5;i++)
  {
	  MyThreadB t2=new MyThreadB();
		Thread thread=new Thread(t2);
		thread.start();
  }
		
		
	}

}
