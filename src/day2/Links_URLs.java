package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_URLs {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com/");
		d.manage().window().maximize();
		

		 List<WebElement> lks=d.findElements(By.tagName("a"));
		 System.out.println(lks.size());
		 
		for (int i = 0; i < lks.size(); i++)
		{
			// if link text is visible
			if(  !  lks.get(i).getText().isEmpty())
			{
			lks.get(i).click();
			
			 String src=d.getCurrentUrl();
			 System.out.println(src);
			 
			 d.navigate().back();
			 
			 lks=d.findElements(By.tagName("a"));
			}
			else
			{
				System.out.println("invible links are----"+i);
			}
			
		}
		

	}

}








