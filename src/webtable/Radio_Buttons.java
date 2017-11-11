package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Radio_Buttons {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://echoecho.com/htmlforms10.htm");
		d.manage().window().maximize();

		Sleeper.sleepTightInSeconds(2);
		
		List<WebElement> radios=d.findElements(By.name("group1"));
		
		for (int i = 0; i < radios.size(); i++) 
		{
			String str=radios.get(i).getAttribute("value");
			String str2=radios.get(i).getAttribute("checked");
			
			 System.out.println(str+"-----"+str2);
		
		}

	}

}
