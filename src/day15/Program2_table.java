package day15;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Program2_table {

	public static void main(String[] args) throws Exception{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		List<WebElement>rowList=driver.findElements(By.xpath("//tr"));
		List<String>nameList=new ArrayList<String>();
		for(int i=2;i<=rowList.size();i++)
		{
			WebElement row=driver.findElement(By.xpath("(//tr)["+i+"]"));
			String name=driver.findElement(By.xpath("(//tr)["+i+"]/td[2]")).getText();
			System.out.print(name+" ");
			String reportId=driver.findElement(By.xpath("(//tr)["+i+"]/td[4]")).getText();
			System.out.println(reportId);
			int sum=0;
			driver.findElement(By.xpath("(//tr)["+i+"]/td[4]/a")).click();			
			List<WebElement>tdListSecond=driver.findElements(By.xpath("//tbody//tr//td[3]"));
			for(int j=1;j<=tdListSecond.size();j++)
			{
				String data=driver.findElement(By.xpath("//tbody//tr["+j+"]//td[3]")).getText();
				sum=sum+Integer.parseInt(data);
			}
			if(!reportId.equals(sum+""))
			{
				nameList.add(name);
			}
			Thread.sleep(2000);
			driver.navigate().back();			
		}
		System.out.println(nameList);

	}

}
