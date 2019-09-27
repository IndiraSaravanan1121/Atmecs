package com.atmecs.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.atmecs.BrowserSetup.BrowserSetup;
import com.atmecs.Constants.Constants;
import com.atmecs.Helper.MouseAction;
import com.atmecs.Pages.ValidationFooterPage;
import com.atmecs.Properties.ReadProperties;

public class ValidateFooter extends BrowserSetup {

	@Test(priority = 0)
	public void verifyFooter() throws Exception {
		test = extent.createTest("verifyFooter");
		ValidationFooterPage.validateFooter(driver);
		MouseAction.scrollUp();
	}

	@Test(priority = 1)
	public void validateContextMenu() throws Exception {
		Actions action = new Actions(driver);
		test = extent.createTest("validateContextMenuItem");
		/*
		 * driver.findElement(By.xpath(ReadProperties.properties("loc_service_btn",
		 * Constants.pathProperties_file))) .click();
		 * driver.findElement(By.xpath(ReadProperties.properties("loc_service_btn",
		 * Constants.pathProperties_file))) .click(); String element = driver
		 * .findElement(By.xpath(ReadProperties.properties("loc_digitallife_btn",
		 * Constants.pathProperties_file))) .getText(); Thread.sleep(2000);
		 * System.out.println(element);
		 */

		WebElement element = driver
				.findElement(By.xpath(ReadProperties.properties("loc_service_btn", Constants.pathProperties_file)));
		action.moveToElement(element);
		action.click(element).build().perform();
		WebElement elementOpen = driver
				.findElement(By.xpath(ReadProperties.properties("loc_digitallife_btn", Constants.pathProperties_file)));

	}
}
