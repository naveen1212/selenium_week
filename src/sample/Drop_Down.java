package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drop_Down {

	public static void main(String[] args)throws Exception {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("JAVA");
		driver.findElement(By.className("nav-input")).click();
	}

}
