package testcases;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class MobileTest {
	
	@AfterSuite
	void afterSuite()
	{
		System.out.println("After Suite");
	}
	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterTest
	void afterTest()
	{
		System.out.println("After Test");
	}
	@BeforeTest
	void beforeTest()
	{
		System.out.println("Before Test");
	}
	@AfterClass
	void afterClass()
	{
		System.out.println("After Class");
	}
	@BeforeClass
	void beforeClass()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	void afterMethod()
	{
		System.out.println("After Method");
	}
	

	@Test(groups="smoke")
	void mobileLogin()
	{
		System.out.println("MOBILE LOGIN SUCCESSFUL");	
	}	
	@Test
	void mobileLogout()
	{	
		System.out.println("MOBILE LOGOUT SUCCESSFUL");
	}
}
