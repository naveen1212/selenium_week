package sat_4_11;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class AutoIT_FileUpload {
  @Test
  public void f() throws IOException {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		// Browse
		driver.findElement(By.id("photo")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		Runtime.getRuntime().exec("E:\\workspace_week14\\SeleniumProject_week14\\AutoIt\\Upload.exe");
		
		
  }
}
