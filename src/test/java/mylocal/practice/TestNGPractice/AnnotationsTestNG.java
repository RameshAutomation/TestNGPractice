package mylocal.practice.TestNGPractice;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationsTestNG {


    public WebDriver driver;
    public String url="https://www.lambdatest.com/";
    
@BeforeSuite(description = "The setup process is completed")
public void setUp()
{   
    // System.setProperty("webdriver.chrome.driver", "C:\\Users\\navyug\\workspace\\QAPractise\\src\\ChromeDriver\\chromedriver.exe");
    WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
    System.out.println("The setup process is completed");
}

@BeforeTest(description = "The profile setup process is completed")
public void profileSetup()
{
    driver.manage().window().maximize();
    System.out.println("The profile setup process is completed");
    
}

@BeforeClass(description = "The app setup process is completed")
public void appSetup()
{
    driver.get(url);
    System.out.println("The app setup process is completed");
}

@BeforeMethod(description = "The login process on lamdatest is completed")
public void checkLogin()
{
      driver.get("https://accounts.lambdatest.com/login");
      driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sripvrameshreddy@gmail.com");
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("MYTEST@123");
      driver.findElement(By.id("login-button")).click();
      System.out.println("The login process on lamdatest is completed");
}

@Test(groups="urlValidation",description = "The url validation test is completed")
public void testCurrentUrl() throws InterruptedException
{
    driver.findElement(By.xpath("//*[@id='app']/header/aside/ul/li[4]/a")).click();
    Thread.sleep(1000);
    String currentUrl= driver.getCurrentUrl();
    assertEquals(currentUrl, "https://automation.lambdatest.com/timeline/?viewType=build&page=1", "url did not matched");
    System.out.println("The url validation test is completed");
}

@AfterMethod(description = "Screenshot of the test is taken")
public void screenShot() throws IOException
{
    TakesScreenshot scr= ((TakesScreenshot)driver);
    File file1= scr.getScreenshotAs(OutputType.FILE);
        
    FileUtils.copyFile(file1, new File(".\\test-output\\test1.PNG"));
    System.out.println("Screenshot of the test is taken");
}

@AfterClass(description = "The close_up process is completed")
public void closeUp()
{
    driver.close();
    System.out.println("The close_up process is completed");
}

@AfterTest(description = "Report is ready to be shared, with screenshots of tests")
public void reportReady()
{
    System.out.println("Report is ready to be shared, with screenshots of tests");
}

@AfterSuite(description = "All close up activities completed" )
public void cleanUp()
{
    
    System.out.println("All close up activities completed");
}

@BeforeGroups("urlValidation")
public void setUpSecurity() {
    System.out.println("url validation test starting");
}

@AfterGroups("urlValidation")
public void tearDownSecurity() {
    System.out.println("url validation test finished");
}



}