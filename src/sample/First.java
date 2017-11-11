package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class First {

	
	
	
	
	public static void main(String[] args) {
		
		WebDriver d;
		
		d=new FirefoxDriver();
		
		d.get("http://google.com");
		//d.manage().window().maximize();
	
		d.findElement(By.id("lst-ib")).sendKeys("selenium");
		
		d.close();
		
	}

}
