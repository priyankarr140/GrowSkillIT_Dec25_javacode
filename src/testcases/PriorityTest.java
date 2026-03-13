package testcases;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority=0)
	void methodC()
	{
		System.out.println("METHOD C");
	}
	@Test(priority=2)
	void methodA()
	{
		System.out.println("METHOD A");
	}
	@Test(priority=1)
	void methodB()
	{
		System.out.println("METHOD B");
	}

}
