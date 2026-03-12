package day14;

public class Program10_Finalize {

	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("CALLED AT GC");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String obj=new String();
		System.gc();
		System.out.println("hello");
		obj=null;

	}

}
