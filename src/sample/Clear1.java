package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clear1 {

	public static void main(String[] args) throws Exception {
		
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("selenium");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='lst-ib']")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("qtp");
		

	}

}
