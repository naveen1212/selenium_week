package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down12 {

	public static void main(String[] args) throws Exception{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://spicejet.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.id("oneWay")).click();
		
		Thread.sleep(2000);
	// click date
		driver.findElement(By.xpath("html/body/form/div[4]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[3]/button")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div[1]/table/tbody/tr[4]/td[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div[1]/table/tbody/tr[5]/td[3]/a")).click();
		
		
		Thread.sleep(2000);
		
		// drop down
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("3 Adults");

	}

}
