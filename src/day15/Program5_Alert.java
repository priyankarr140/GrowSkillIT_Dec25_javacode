package day15;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5_Alert {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(6000);
		driver.findElement(By.id("alert")).click();
		Thread.sleep(2000);
		Alert alertBtn=driver.switchTo().alert();
		System.out.println(alertBtn.getText());
		alertBtn.accept();
		
		Thread.sleep(3000);
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		Alert confirmBtn=driver.switchTo().alert();
		System.out.println(confirmBtn.getText());
		confirmBtn.dismiss();
		
		Thread.sleep(3000);
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		Alert promptBtn=driver.switchTo().alert();
		System.out.println(promptBtn.getText());
		promptBtn.sendKeys("java");
		Thread.sleep(2000);
		promptBtn.accept();
		
		
	}

}
