package com.aktar.selenium;

import org.junit.After;
import org.junit.Before;

import com.thoughtworks.selenium.DefaultSelenium;

public class WebOpenClass {
DefaultSelenium selenium=new DefaultSelenium("localhost",4444,"firefox","https://online.citibank.com/US/JPS/portal/Index.do");
@Before
public void OpenWeb(){
	selenium.start();
	selenium.open("/");
	selenium.windowMaximize();
	selenium.setSpeed("4000");
}
@After
public void BrowserClose(){
	selenium.close();
	selenium.stop();
}
}
