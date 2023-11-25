package mylocal.practice.TestNGPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	WebDriver driver;
	@Test
	public void getPageTitle() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		 driver.manage().timeouts().implicitlyWait(java.time.Duration.ofMinutes(1));
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		// close all browser and sessions
		driver.quit();
	}

}
