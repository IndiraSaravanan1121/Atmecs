package com.atmecs.Helper;

import java.util.concurrent.TimeUnit;

import com.atmecs.BrowserSetup.BrowserSetup;
import com.atmecs.Constants.Constants;

public class Wait extends BrowserSetup {
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Constants.implicit_wait, TimeUnit.SECONDS);
	}
}