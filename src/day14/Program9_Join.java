package day14;
class Test
{ 
	volatile int id;
	
}
class MyThreadE extends Thread
{
	public void run()
	{
		System.out.println("Hello");
	}
}
public class Program9_Join {
	public static void main(String[] args) throws Exception {
		MyThreadE t1=new MyThreadE();
		t1.start();
		t1.join();
		System.out.println("Bye");

	}

}
