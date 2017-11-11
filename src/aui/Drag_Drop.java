package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
          Thread.sleep(2000);
          
          d.switchTo().frame(0);
          
          // source
          WebElement src=d.findElement(By.id("draggable"));
          WebElement targ=d.findElement(By.id("droppable"));
          
          Actions dd=new Actions(d);
          
          dd.dragAndDrop(src, targ).perform();
          
        //  dd.doubleClick(src).perform();
          
         

	}

}
