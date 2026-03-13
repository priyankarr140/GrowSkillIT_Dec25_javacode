package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataTest {
	@Test(dataProvider="getCred")
	void signIn(String username,String pass)
	{
		System.out.println(username+":"+pass);
	}	
	@DataProvider
	Object[][]getCred()
	{
		Object[][]cred=new Object[3][2];
		cred[0][0]="user1";
		cred[0][1]="pass1";
		cred[1][0]="user2";
		cred[1][1]="pass2";
		cred[2][0]="user3";
		cred[2][1]="pass3";
		return cred;
	}
	@Parameters({"username","pass"})
	@Test
	void signOut(String username,String pass)
	{
		System.out.println(username+":"+pass);
	}	
	

}
