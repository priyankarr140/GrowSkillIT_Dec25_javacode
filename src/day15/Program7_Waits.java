package day15;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program7_Waits {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().
		//pageLoadTimeout(Duration.ofMillis(1));	
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		//driver.manage().timeouts().implicitlyWait
		//(Duration.ofSeconds(12));
		Thread.sleep(6000);
		
		WebElement rangeslider = driver.findElement(By.xpath("//input[@type='range']"));
		Thread.sleep(2000);

		for(int i=0;i<=5;i++)
		{
		rangeslider.sendKeys(Keys.ARROW_RIGHT);
		}
		Thread.sleep(2000);
		WebElement rangeslider2 = driver.findElements(By.xpath("//input[@type='range']")).get(1);		Thread.sleep(2000);

		for(int i=0;i<=7;i++)
		{
			rangeslider2.sendKeys(Keys.ARROW_LEFT);
		}

		

		
		
		
	//	WebElement left=driver.findElement(By.className("thumb-left"));
		//Actions act=new Actions(driver);
		//ct.clickAndHold(left).
		//keyDown(Keys.ARROW_RIGHT).perform();
		//act.keyDown(Keys.ARROW_RIGHT).perform();
		//act.keyDown(Keys.ARROW_RIGHT).perform();
		Thread.sleep(6000);
		WebElement startBtn=
		driver.findElement(By.xpath("//*[@data-testid='start-button']"));
		startBtn.click();
					
				//System.out.println(helloText.getText());
				/*WebDriverWait wait=new WebDriverWait(driver,
						Duration.ofSeconds(15));*/
		
		Wait<ChromeDriver> wait = new FluentWait<>(driver)
		        .withTimeout(Duration.ofSeconds(15))      // Maximum wait time
		        .pollingEvery(Duration.ofSeconds(3))      // Polling interval
		        .ignoring(NoSuchElementException.class);
				
				
				
		wait.until(ExpectedConditions.textToBePresentInElementLocated(
				(By.xpath("//*[@data-testid='message-display']")),"hello"));
		System.out.println("TEXT WAS FOUND");
		
	
		
		//Thread.sleep(6000);

	}

}
