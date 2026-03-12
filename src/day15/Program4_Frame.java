package day15;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4_Frame {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		/*WebElement frameElement=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.name("username")).sendKeys("hello");*/
		WebElement outerFrame=driver.findElement(By.id("outer"));
		driver.switchTo().frame(outerFrame);
		WebElement innerFrame=driver.findElement(By.id("inner"));
		driver.switchTo().frame(innerFrame);
		driver.findElement(By.id("input2")).sendKeys("hello");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("input1")).sendKeys("bye");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@value='java']")).click();


		
		
		
		}

}
