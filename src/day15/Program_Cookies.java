package day15;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_Cookies {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("	https://www.geeksforgeeks.org");
		Thread.sleep(8000);
		driver.manage().addCookie(new Cookie("keyA","valueA"));
		Set<Cookie>cookies=driver.manage().getCookies();
		for(Cookie c:cookies)
		{
			System.out.println(c.getName()+":"+c.getName());
		}

	}

}
