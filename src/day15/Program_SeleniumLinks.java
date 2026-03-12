package day15;

import org.openqa.selenium.*;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.*;
public class Program_SeleniumLinks {
	public static void main(String[] args) throws Exception{
		
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			try {
			HttpURLConnection conn=(HttpURLConnection) new URL(link.getAttribute("href"))
					.openConnection();
			conn.setRequestMethod("GET");
			if(conn.getResponseCode()==404)
				System.out.println(link.getAttribute("href")+":link is not working");
			else
				System.out.println(link.getAttribute("href")+":link is working");
			}
			catch(Exception ex)
			{
				
			}
			
		}
	}

}
