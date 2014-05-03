package com.aktar.web;

import io.selendroid.SelendroidDriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class ChaseRegis {
WebDriver driver =new RemoteWebDriver(DesiredCapabilities.android());
	@Before
	public void OpeningBrowser(){
		driver.get("https://www.chase.com/");
	}
	@After
	public void TestDone(){
		driver.close();
	}
}

