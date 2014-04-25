package com.aktar.seleni;

import org.junit.Test;

public class TestStart1 extends StartTest {
@Test
public void RegisTration(){
	key.clickAt("firstname", "rohan");
	key.clickAt("lastname", "calahan");
}
}
