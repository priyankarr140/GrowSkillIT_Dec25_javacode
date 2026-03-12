package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class Program_WindowHandle {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(6000);
		String homepage=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='Open This Page']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(homepage);
		driver.findElement(By.xpath("//*[text()='Open Google']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(homepage);
		driver.findElement(By.xpath("//*[text()='Open Facebook']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(homepage);
		Set<String>windows=driver.getWindowHandles();
		for(String win:windows)
		{
			driver.switchTo().window(win);
			Thread.sleep(3000);
			if(driver.getTitle().contains("Engineer"))
				driver.close();
			else if(driver.getTitle().contains("Google"))
				driver.findElement(By.name("q")).sendKeys("Selenium");
		}
		

	}

}
