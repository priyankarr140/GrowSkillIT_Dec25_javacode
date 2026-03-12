package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_DatePicker {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.oyorooms.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'datePickerDesktop')]")).click();
		Thread.sleep(3000);
		driver.findElement
		(By.xpath("//div[contains(@class,'DateRangePicker__PaginationArrow--next')]")).click();
		Thread.sleep(3000);
		driver.findElement
		(By.xpath("//div[contains(@class,'DateRangePicker__PaginationArrow--next')]")).click();
		Thread.sleep(3000);
		driver.findElement(
		By.xpath("//span[@class='DateRangePicker__DateLabel' and text()='10']")).click();
		Thread.sleep(3000);
		driver.findElement(
		By.xpath("(//span[@class='DateRangePicker__DateLabel' and text()='5'])[2]")).click();
		

		
		

	}

}
