package day16;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Program2_Saucelabs {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("username", "oauth-engineerdiaries-ce27e");
		sauceOptions.put("accessKey", "ce0df645-3d31-417b-bdd5-2b027d48ed91");
		sauceOptions.put("build", "selenium-build-AK0NR");
		sauceOptions.put("name", "GSIDec25");
		browserOptions.setCapability("sauce:options", sauceOptions);
		
		// start the session
		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);

		// run commands and assertions
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(8000);
		driver.findElement(By.id("input_text")).sendKeys("GROWSKILL IT DEC BATCH");
	//	String title = driver.getTitle();
		//boolean titleIsCorrect = title.contains("Swag Labs");
		//String jobStatus = titleIsCorrect ? "passed" : "failed";

		// end the session
		//driver.executeScript("sauce:job-result=" + jobStatus);
		//driver.quit();

	}

}
