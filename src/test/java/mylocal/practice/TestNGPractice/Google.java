package mylocal.practice.TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	WebDriver driver;
	@Test
	public void getPageTitle() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		 driver.manage().timeouts().implicitlyWait(java.time.Duration.ofMinutes(1));
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
