package day15;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
public class Program_ShadowDOM {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(".//image1.jpg"));
		
		
		SearchContext host=driver.findElement(By.xpath("//div[@data-testid='shadow-host']"))
		.getShadowRoot();
		
		WebElement p=host.findElement(By.cssSelector("div > p"));
		System.out.println(p.getText());
		

	}

}
