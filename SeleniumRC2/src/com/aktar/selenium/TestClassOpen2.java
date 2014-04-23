package com.aktar.selenium;

import org.junit.Test;

public class TestClassOpen2 extends WebOpenClass {
@Test
public void TestOpens3(){
	selenium.click("SignonForm");
	selenium.clickAt("username", "johny");
	selenium.clickAt("pwd", "aa6789");
	selenium.check("rememberuserid");
	selenium.click("find-submit");
	
	
}
}
