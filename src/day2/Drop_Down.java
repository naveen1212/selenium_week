package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Drop_Down {

	@Test
	public void waitTest()
	 {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.alaskaair.com/");
		d.manage().window().maximize();

		Sleeper.sleepTightInSeconds(2);
		
	 WebElement	drop=d.findElement(By.id("adultCount"));
	 
	List<WebElement> items=drop.findElements(By.tagName("option"));
	System.out.println(items.size());
	
	for (int i = 0; i < items.size(); i++) 
	{
		items.get(i).click();
		
		Sleeper.sleepTightInSeconds(1);
		
		if (items.get(i).isSelected()) 
		{
			System.out.println("element is working");
		}
		else
			System.out.println("element is  not working");
	}
	}

}
