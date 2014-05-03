package com.aktar.web;

import org.junit.Test;
import org.openqa.selenium.By;

public class HomePage extends ChaseRegis {
@Test
public void TestLogIn(){
	driver.findElement(By.id("usr_name_home")).sendKeys("aktar");
}
}
