package sat_4_11;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.OaIdl.ELEMDESC._ELEMDESC;

public class Robot_SaveFile {
  @Test
  public void f() throws AWTException {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		// Browse
		driver.findElement(By.linkText("3.7.0")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
         rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		 rb.delay(2000);
		Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(size);
		
	
		rb.mouseMove(1162, 120);
		
		 rb.delay(1000);
		
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
  }
}











