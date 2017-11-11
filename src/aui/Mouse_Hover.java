package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_Hover {

	public static void main(String[] args) throws Exception{
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.emirates.com/in/English/");
		d.manage().window().maximize();
		
          Thread.sleep(2000);
          
          WebElement src=d.findElement(By.xpath("html/body/form/div[3]/div[1]/header/div[2]/div/div/div[2]/div[1]/div/ul/li[3]/a"));
          
          WebElement src12=d.findElement(By.xpath(".//*[@id='gnav-loyalty']/a"));
          
          WebElement src1234=d.findElement(By.xpath("html/body/form/div[3]/div[1]/header/div[2]/div/div/div[2]/div[1]/div/ul/li[5]/div/div[1]/div[4]/div/h2/a"));
          
          Thread.sleep(2000);
          
          Actions obj=new  Actions(d);
          
          obj.moveToElement(src).perform();
          
       
          Sleeper.sleepTightInSeconds(2);
          
          obj.moveToElement(src12).perform();
          
          Sleeper.sleepTightInSeconds(1);
          
          obj.contextClick(src1234).sendKeys("W").build().perform();
          
          obj.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click().build().perform();
          
        

	}

}
