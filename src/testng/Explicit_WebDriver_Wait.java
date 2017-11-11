package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Explicit_WebDriver_Wait {
 
	WebDriver driver;
	
	
	
	@Test
  public void f() {
	 
		WebDriverWait wait=new WebDriverWait(driver, 120);
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[4]/div[1]/div[2]/div/div[2]/div[1]/div/a"))).click();
		
		
		
		
		// Click Learn more link
		//wait.until(ExpectedConditions.visibilityOfElementLocated
			//	(By.xpath("html/body/div[4]/div[1]/div[2]/div/div[2]/div[3]/div/a"))).click();

  }
  
  
  @BeforeMethod
  public void setUp()
  {
	   driver=new FirefoxDriver();
		driver.navigate().to("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
  }
}




