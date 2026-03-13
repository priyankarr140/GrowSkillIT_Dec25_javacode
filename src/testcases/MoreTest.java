package testcases;

import org.testng.annotations.Test;

public class MoreTest {
	@Test
	void login()
	{
		int num=10/0;
		System.out.println("LOGIN");
	}
	@Test(enabled=false)
	void methodB()
	{
		System.out.println("MethodB");
	}
	@Test(dependsOnMethods= {"login"})
	void logout()
	{
		System.out.println("LOGOUT");
	}
	@Test(timeOut=5000)
	void methodD() throws InterruptedException
	{
		Thread.sleep(7000);
		System.out.println("METHOD:D");
	}

}
