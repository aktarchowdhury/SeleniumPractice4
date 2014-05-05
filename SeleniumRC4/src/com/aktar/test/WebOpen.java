package com.aktar.test;

import org.junit.After;
import org.junit.Before;

import com.thoughtworks.selenium.DefaultSelenium;

public class WebOpen {
DefaultSelenium selene=new DefaultSelenium("localhost",4444,"firefox","https://online.citibank.com/");
@Before
public void HomePageOpens(){
	selene.start();
	selene.open("/");
	selene.windowMaximize();
	selene.setSpeed("4000");
}
@After
public void TestDone(){
	//selene.close();
	//selene.stop();
}
}
