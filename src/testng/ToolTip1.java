package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTip1 {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://demoqa.com/tooltip/");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		WebElement src=d.findElement(By.id("age"));
		
		Actions tt=new Actions(d);
		
		tt.moveToElement(src).perform();
		
		System.out.println(d.findElement(By.className("ui-tooltip-content")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		

  }
}
