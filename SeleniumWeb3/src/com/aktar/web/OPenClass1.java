package com.aktar.web;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OPenClass1 {
WebDriver driver=new FirefoxDriver();
@Before
public void OpenSite(){
	driver.get("http://www.cvs.com/");
	driver.findElement(By.id("navTab_01")).click();
	/*driver.findElement(By.id("navTab_03")).click();	
	driver.findElement(By.id("tbEmailmp")).sendKeys("aktarchowdhury16@gmail.com");
	driver.findElement(By.id(	"tbZipmp")).sendKeys("11223");
	driver.findElement(By.id("btnSubmitmp")).submit();*/
	
	
	
	
	
	
	
}
@After
public void TestDone(){
	//driver.close();
	
}
}
