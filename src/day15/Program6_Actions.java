package day15;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program6_Actions {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(6000);
		WebElement hover=driver.findElement(By.xpath("//*[@data-testid='hover-box']"));
		Actions act=new Actions(driver);
		
		WebElement inputBox=driver.findElement(By.id("input_text"));
		inputBox.clear();
		Thread.sleep(2000);
		act.keyDown(Keys.SHIFT).perform();
		inputBox.sendKeys("java ");
		act.keyUp(Keys.SHIFT).perform();
		inputBox.sendKeys("selenium ");
		Thread.sleep(2000);
		
		WebElement fancyBtn=
				driver.findElement(By.xpath("//*[@data-testid='fancy-button']"));;

		act.scrollToElement(fancyBtn).perform();


		WebElement doubleClickBtn=
				driver.findElement(By.xpath("//*[@data-testid='double-click-box']"));;
				act.doubleClick(doubleClickBtn).perform();

		
		
		
		
		
		act.moveToElement(hover).perform();
		Thread.sleep(2000);
		WebElement rightClick=driver.findElement(By.xpath("//*[@data-testid='right-click-box']"));;
		act.contextClick(rightClick).perform();
		Thread.sleep(6000);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(
				By.xpath("//*[contains(text(),'Drop here')]"));

		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(6000);
		
		
	}

}
