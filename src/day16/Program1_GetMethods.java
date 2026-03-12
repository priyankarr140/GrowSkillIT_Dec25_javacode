package day16;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Program1_GetMethods {

	public static void main(String[] args) throws Exception{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(8000);
		By python=RelativeLocator.with(By.xpath("//input[@value='python']"))
				.toRightOf(By.xpath("//input[@value='java']"));
		//toRightOf();
		driver.findElement(python).click();
		/*WebElement inputBox=driver.findElement(By.id("input_text"));
		System.out.println(inputBox.getAccessibleName());
		System.out.println(inputBox.getAriaRole());
		System.out.println(inputBox.getAttribute("placeholder"));
		System.out.println(inputBox.getCssValue("font-size"));
		System.out.println(inputBox.getDomAttribute("value"));
		System.out.println(inputBox.getDomProperty("text"));
		System.out.println(inputBox.getTagName());
		System.out.println(inputBox.isDisplayed());
		System.out.println(inputBox.isEnabled());
		System.out.println(inputBox.isSelected());
		System.out.println(inputBox.getLocation().getX());
		System.out.println(inputBox.getRect().getHeight());

*/






		
	}

}
