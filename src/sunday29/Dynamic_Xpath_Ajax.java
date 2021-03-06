package sunday29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Dynamic_Xpath_Ajax {
	
	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://yahoo.com");
		d.manage().window().maximize();

		Sleeper.sleepTightInSeconds(2);
		// search box
		d.findElement(By.id("uh-search-box")).sendKeys("selenium");
		
		Sleeper.sleepTightInSeconds(2);
		
		//identify elements from ajax
		List<WebElement> ajax=d.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3_1509')]/li"));
		System.out.println(ajax.size());
		
		Sleeper.sleepTightInSeconds(2);
		
		//ajax.get(3).click();
		
		for (int i = 0; i < ajax.size(); i++) 
		{
			if(ajax.get(i).getText().equals("selenium tutorial"))
			{
				ajax.get(i).click();
				break;
			}
		}
		
	}

}









