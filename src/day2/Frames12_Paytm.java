package day2;

import java.util.List;

import org.omg.PortableInterceptor.TRANSPORT_RETRY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Frames12_Paytm {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://paytm.com/");
		d.manage().window().maximize();
		
Sleeper.sleepTightInSeconds(2);
		
		d.findElement(By.xpath(".//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div")).click();
		
		Sleeper.sleepTightInSeconds(1);
		
		 List<WebElement> frames=d.findElements(By.tagName("iframe"));
		 System.out.println(frames.size());
		 
		 for (int i = 0; i < frames.size(); i++) 
		 {
			 d.switchTo().frame(i);
			 
			 try 
			 {
				 d.findElement(By.id("input_0")).sendKeys("loan2134242343");
				 d.findElement(By.id("input_1")).sendKeys("loanxccccccccc");
				 Sleeper.sleepTightInSeconds(1);
				 d.findElement(By.cssSelector(".md-raised.md-primary.btn-new.mt-20.login-btn.md-button.ng-scope.md-default-theme")).click();
				
			} 
			 catch (Exception e) 
			 {
				System.out.println(e.getMessage());
			}
				 
		}
		 d.switchTo().defaultContent();
		
		 
	}

}
