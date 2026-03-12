package day15;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class Program_Scroll {
	public static void main(String[] args) throws Exception{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		JavascriptExecutor js=driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}

}
