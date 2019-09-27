package com.atmecs.Pages;

import java.time.LocalDate;
import java.time.Period;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.atmecs.BrowserSetup.BrowserSetup;
import com.atmecs.Constants.Constants;
import com.atmecs.Helper.MouseAction;
import com.atmecs.Properties.ReadProperties;

public class ValidateBlogsPage extends BrowserSetup {

	public static void validateBlogsDateDifference() throws Exception {

		LocalDate date1 = LocalDate.of(2019, 3, 15);
		LocalDate date2 = LocalDate.now();

		Period d1 = Period.between(date1, date2);
		System.out.println("YEARS = " + d1.getYears());
		System.out.println("MONTHS = " + d1.getMonths());
		System.out.println("DAYS = " + d1.getDays());
		System.out.println("TOTAL MONTHS = " + d1.toTotalMonths());
	}

	public static void validateBreadcrumb() throws Exception {
		String element = driver
				.findElement(By.xpath(ReadProperties.properties("loc_breedcrumb_text", Constants.pathProperties_file)))
				.getText();
		Assert.assertEquals(element, "Home › AI › Debunking Myths about AI", "BreadCrumb Matched");
	}

	public static void validateBlogTitle() throws Exception {
		String element = driver
				.findElement(By.xpath(ReadProperties.properties("loc_blogtitle_txt", Constants.pathProperties_file)))
				.getText();
		Assert.assertEquals(element, "Debunking Myths about AI", "Title Matched");
	}

	public static void validateBlogDate() throws Exception {
		String element = driver
				.findElement(By.xpath(ReadProperties.properties("loc_blogdate_txt", Constants.pathProperties_file)))
				.getText();
		Assert.assertEquals(element, "March 15, 2019", "Date Matched");
	}

	public static void validateAlertMessage() throws Exception {
		MouseAction.scrollDown();
		driver.findElement(By.xpath(ReadProperties.properties("loc_submit_btn", Constants.pathProperties_file)))
				.click();
		Alert alert = driver.switchTo().alert();
		System.out.println("checking......." + alert.getText());

	}
}