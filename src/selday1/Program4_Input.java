package selday1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class Program4_Input {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		List<WebElement>genderList=driver.findElements(By.name("gender"));
		genderList.get(1).click();
		WebElement inputBox=driver.findElement(By.id("input_text"));
		inputBox.clear();
		Thread.sleep(2000);
		inputBox.sendKeys("java");
		Thread.sleep(2000);
		
		

	}

}
