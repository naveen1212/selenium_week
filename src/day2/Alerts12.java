package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Alerts12 {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		System.out.println("bR luanched");
		
		
		d.get("http://primusbank.qedgetech.com/");
		//System.out.println("URL enterred");
		
		d.manage().window().maximize();

		Sleeper.sleepTightInSeconds(2);
		
		d.findElement(By.id("login")).click();
		
		String str=d.switchTo().alert().getText();
		System.out.println(str);
		
		Sleeper.sleepTightInSeconds(2);
		
		d.switchTo().alert().accept();
		
	}

}
