package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_All {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://icicibank.com");
		driver.manage().window().maximize();
		
		 List<WebElement> lks=driver.findElements(By.tagName("a"));
		 System.out.println(lks.size());
		 
		 for (int i = 0; i < lks.size(); i++) 
		 {
			 
			String names=lks.get(i).getText();
			System.out.println(names);
			
		}
		 
		 

	}

}
