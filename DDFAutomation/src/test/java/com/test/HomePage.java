package com.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.base.TestNgSetup;
import com.pageObject.facebook;

public class HomePage extends TestNgSetup  {
	
	
	@Test
	public void navigateToProfile() throws IOException{
		
		setup();
		
		facebook fb = new facebook(driver);
		
		fb.navigateToProfile();
		
		
		
	}

}
