package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Header_Links {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://bing.com");
		
		// header
		WebElement block=d.findElement(By.id("sc_hdu"));
		
		// links from header
		List<WebElement> lks=block.findElements(By.tagName("a"));
		System.out.println(lks.size());
		
		for (int i = 0; i < lks.size(); i++) 
		{
			System.out.println(lks.get(i).getText());
		}

	}

}
