package com.aktar.selenium;

import org.junit.Test;

public class TestClassOpen extends WebOpenClass {
@Test
public void TestOpens(){
	selenium.click("banking");
	selenium.click("mm_banking_offer");
	selenium.click("creditcards");
	selenium.click("mm_banking_offer");
	selenium.click("lending");
	selenium.click("mm_lending_offer");
	selenium.click("investing");
	selenium.click("mm_investing_offer");
	selenium.click("business");
	selenium.click("mm_business_offer");
	
}
}
