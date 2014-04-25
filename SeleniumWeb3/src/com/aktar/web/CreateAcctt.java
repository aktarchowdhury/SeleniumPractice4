package com.aktar.web;

import org.junit.Test;
import org.openqa.selenium.By;

public class CreateAcctt extends OPenClass1 {
@Test
public void Registration(){
	driver.findElement(By.id("signInOverlay")).click();
	driver.findElement(By.id("loginPopup")).sendKeys("aktarchowdhury16@gmail.com");
	driver.findElement(By.id("passwordPopup")).sendKeys("aa4567");
	driver.findElement(By.id("remmeopt")).click();
	driver.findElement(By.id("create")).submit();
	
}
}
