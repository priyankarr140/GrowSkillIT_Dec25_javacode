package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
	
	
	@Test
	void login()
	{
		//try {
		//int num=10/0;
		System.out.println("LOGIN SUCCESSFUL");
		//}catch(Exception ex)
		{
			
		}
	}
	
	@Test
	void logout()
	{
		boolean input=false;
		String str="hello";
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(input);
		//Assert.assertTrue(input);
		//Assert.assertEquals("hello", str);
		System.out.println("LOGOUT SUCCESSFUL");
		soft.assertAll();
	}
	

}
