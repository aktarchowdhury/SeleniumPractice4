package com.aktar.test;

import org.junit.Test;

public class SignOnPage2 extends WebOpen {
@Test
public void SignOn3(){	
	selene.click("SignonForm");
	selene.clickAt("username", "sam");
	selene.clickAt("pwd", "Aaa6789");
	selene.check("rememberuserid");
	selene.click("find-submit");
}
}
