package day14;
class MyThreadC extends Thread
{
	public void run()
	{
		System.out.println("Bye");
	}
}
public class Program_Join {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThreadC t1=new MyThreadC();
		t1.start();
		t1.join();
		System.out.println("Hello");

	}

}
