package com.aktar.seleni;

import org.junit.Test;

public class TestStart extends StartTest{
@Test
public void Homepage(){
	key.click("homeAnonymousLoginForm");
	key.click("mainoption");	
	key.click("mainContentStart");
	key.clickAt("uname", "aktar");
	key.clickAt("password2", "aa786786");
	key.check("rememberMe");
	key.click("sign In");
	

}

}
