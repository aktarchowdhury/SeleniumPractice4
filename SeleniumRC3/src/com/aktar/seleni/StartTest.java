package com.aktar.seleni;

import org.junit.After;
import org.junit.Before;

import com.thoughtworks.selenium.DefaultSelenium;

public class StartTest {
DefaultSelenium key=new DefaultSelenium("localhost",4444,"firefox","http://www.walgreens.com/");
@Before
public void OpenPage(){
key.start();
key.open("/");
key.windowMaximize();
key.setSpeed("4000");
}
@After
public void closingSession(){
	//key.close();
	//key.stop();
	
}
}
