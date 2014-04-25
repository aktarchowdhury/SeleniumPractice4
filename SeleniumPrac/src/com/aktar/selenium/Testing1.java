package com.aktar.selenium;

import org.junit.Test;
import org.openqa.selenium.By;

public class Testing1 extends MainClass {
@Test
public void TestContinue(){
	driver.findElement(By.id("signIn")).click();
	driver.findElement(By.linkText("Create An Account")).click();
}
}
