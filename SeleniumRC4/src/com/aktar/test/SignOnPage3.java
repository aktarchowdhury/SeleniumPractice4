package com.aktar.test;

import org.junit.Test;

public class SignOnPage3 extends WebOpen{
@Test
public void SignOn4(){	
	selene.allowNativeXpath("id('signOnFlyout')/x:ul/x:li[1]/x:a");
	selene.clickAt("tab2", "Get Started");
	selene.clickAt("ltab2", "KEEP IT SIMPLE");
	selene.clickAt("ltab3", "PAY EASIER");
	selene.clickAt("ltab4", "LOW RATES");
	
	
}

}
