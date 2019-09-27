package com.atmecs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.BrowserSetup.BrowserSetup;
import com.atmecs.Constants.Constants;
import com.atmecs.Helper.MouseAction;
import com.atmecs.Properties.ReadProperties;

public class ValidationFooterPage extends BrowserSetup {

	public static void validateFooter(WebDriver driver) throws Exception {
		MouseAction.scrollDown();
		String actualFooter = driver
				.findElement(By.xpath(ReadProperties.properties("loc_footerlink_txt", Constants.pathProperties_file)))
				.getText();
		System.out.println(actualFooter);
		MouseAction.scrollUp();
		driver.findElement(By.xpath(ReadProperties.properties("loc_aboutus_btn", Constants.pathProperties_file)))
				.click();
		MouseAction.scrollDown();
		String aboutusFooter = driver
				.findElement(By.xpath(ReadProperties.properties("loc_footerlink_txt", Constants.pathProperties_file)))
				.getText();
		System.out.println(aboutusFooter);
		MouseAction.scrollUp();
		driver.findElement(By.xpath(ReadProperties.properties("loc_service_btn", Constants.pathProperties_file)))
				.click();
		MouseAction.scrollDown();
		String servicesFooter = driver
				.findElement(By.xpath(ReadProperties.properties("loc_footerlink_txt", Constants.pathProperties_file)))
				.getText();
		MouseAction.scrollUp();
		driver.findElement(By.xpath(ReadProperties.properties("loc_partners_btn", Constants.pathProperties_file)))
				.click();
		MouseAction.scrollDown();
		String partnersFooter = driver
				.findElement(By.xpath(ReadProperties.properties("loc_footerlink_txt", Constants.pathProperties_file)))
				.getText();
		MouseAction.scrollUp();
		driver.findElement(By.xpath(ReadProperties.properties("loc_media_btn", Constants.pathProperties_file))).click();
		MouseAction.scrollDown();
		String mediaFooter = driver
				.findElement(By.xpath(ReadProperties.properties("loc_footerlink_txt", Constants.pathProperties_file)))
				.getText();
		MouseAction.scrollUp();
		driver.findElement(By.xpath(ReadProperties.properties("loc_insight_btn", Constants.pathProperties_file)))
				.click();
		MouseAction.scrollDown();
		String insightsFooter = driver
				.findElement(By.xpath(ReadProperties.properties("loc_footerlink_txt", Constants.pathProperties_file)))
				.getText();
		MouseAction.scrollUp();
		driver.findElement(By.xpath(ReadProperties.properties("loc_careers_btn", Constants.pathProperties_file)))
				.click();
		MouseAction.scrollDown();
		String careersFooter = driver
				.findElement(By.xpath(ReadProperties.properties("loc_footerlink_txt", Constants.pathProperties_file)))
				.getText();
		MouseAction.scrollUp();
		driver.findElement(By.xpath(ReadProperties.properties("loc_contactus_btn", Constants.pathProperties_file)))
				.click();
		MouseAction.scrollDown();
		String contactusFooter = driver
				.findElement(By.xpath(ReadProperties.properties("loc_footerlink_txt", Constants.pathProperties_file)))
				.getText();

	}

}
