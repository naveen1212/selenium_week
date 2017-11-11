package day2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class PopUp_Windows {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.onlinesbi.com/");
		d.manage().window().maximize();

		Sleeper.sleepTightInSeconds(2);
		
		System.out.println(d.getWindowHandle());
		
		d.findElement(By.xpath(".//*[@id='primary_navigation']/li[7]/a")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		Set<String> str=d.getWindowHandles();
		System.out.println(str);
		
		Object ids[]=str.toArray();
		
		String pop=ids[1].toString();
		
		
		d.switchTo().window(pop);
		
		Sleeper.sleepTightInSeconds(2);
		
		d.findElement(By.id("txtsearch")).sendKeys("loan");
		d.close();
		Sleeper.sleepTightInSeconds(2);
		d.switchTo().window(ids[0].toString());
		
		d.findElement(By.xpath(".//*[@id='primary_navigation']/li[9]/a")).click();
		
		
	}

}
