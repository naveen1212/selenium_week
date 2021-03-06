package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ExplicitWait_Fluentwait {
	
	FirefoxDriver driver;
	
	@Test
	public void waitTest()
	{
		 driver=new FirefoxDriver();
		driver.navigate().to("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
		
	FluentWait<WebDriver> www=new FluentWait<WebDriver>(driver)
			.withTimeout(50, TimeUnit.SECONDS)
			.pollingEvery(5, TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
			
		
		// Click Learn more link
		//FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver).withTimeout(20,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		
		www.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[4]/div[1]/div[2]/div/div[2]/div[1]/div/a"))).click();
		
		System.out.println("done");
		
		
		
		
	}

}



