package com.atmecs.Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.atmecs.Constants.Constants;
import com.atmecs.Properties.ReadProperties;

public class FooterPage extends ValidationFooterPage {

	public static void validatefooterPage(String expectedFooter) throws Exception {
		String actualFooter = driver
				.findElement(By.xpath(ReadProperties.properties("loc_footerlink_txt", Constants.pathProperties_file)))
				.getText();
		Assert.assertEquals(actualFooter, expectedFooter);
	}

}
