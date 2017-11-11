package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Slider112 {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/slider/");
		d.manage().window().maximize();
		
       Sleeper.sleepTightInSeconds(2);
       
       d.switchTo().frame(0);
       
      WebElement src= d.findElement(By.xpath("html/body/div/span"));
       
      Actions sldr=new Actions(d);
      
      sldr.dragAndDropBy(src, 500, 0).build().perform();

	}

}











