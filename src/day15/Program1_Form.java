package day15;
import org.openqa.selenium.*;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Program1_Form {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		WebElement countryTag=driver.findElement(By.id("country"));
		//countryTag.sendKeys("India");
		//Thread.sleep(2000);
		Select selectCountry=new Select(countryTag);
		selectCountry.selectByIndex(12);
		Thread.sleep(4000);
		selectCountry.selectByValue("china");
		Thread.sleep(4000);
		selectCountry.selectByVisibleText("Japan");
		
		
		List<WebElement>checkBoxes=driver.findElements(By.name("programmingLang"));
		checkBoxes.get(0).click();
		Thread.sleep(2000);
		checkBoxes.get(4).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("date"))
		.sendKeys("07-03-2026");
		
		
		
		

	}

}
