package test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public void test1(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	File vo = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		driver.manage().window().maximize();
		driver.get("https://www.zocdoc.com/"); 
//		driver.close();
		
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.zocdoc.com/");
		//driver.findElement(By.xpath("//*[@title='Back to homepage']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@stroke-linecap='butt']")).getText());
		System.out.println(driver.findElements(By.tagName("g")).size());
		driver.close();
	}
	
}
