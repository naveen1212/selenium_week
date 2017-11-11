package sat_4_11;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_Login_JXL {
  @Test
  public void f() throws BiffException, IOException {
	  
	  FileInputStream fis=new FileInputStream("E:\\workspace_week14\\SeleniumProject_week14\\TestData\\test1.xls");
	  Workbook wb=Workbook.getWorkbook(fis);
	  Sheet ws= wb.getSheet("Sheet1");
	  
	  
	  WebDriver d=new FirefoxDriver();
	  d.get(ws.getCell(2, 1).getContents());
	  d.manage().window().maximize();
	  
	  d.findElement(By.id("txtUsername")).sendKeys(ws.getCell(0,1).getContents());
	  d.findElement(By.id("txtPassword")).sendKeys(ws.getCell(1,1).getContents());
	  d.findElement(By.id("btnLogin")).click();
	  
	  
  }
}
