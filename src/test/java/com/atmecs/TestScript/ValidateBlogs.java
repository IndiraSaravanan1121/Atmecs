
package com.atmecs.TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.Constants.Constants;
import com.atmecs.Helper.MouseAction;
import com.atmecs.Pages.ValidateBlogsPage;
import com.atmecs.Properties.ReadProperties;

public class ValidateBlogs extends ValidateFooter {

	@Test(priority = 2)
	public void validateBlogsDate() throws Exception {
		String insight = ReadProperties.properties("loc_insight_btn", Constants.pathProperties_file);
		MouseAction.mouseOver(insight);
		driver.findElement(By.xpath(ReadProperties.properties("loc_blogs_btn", Constants.pathProperties_file))).click();
		ValidateBlogsPage.validateBlogsDateDifference();
		driver.findElement(By.xpath(ReadProperties.properties("loc_readmore_link", Constants.pathProperties_file)))
				.click();
	}

	@Test(priority = 3)
	public void validateBlogsContent() throws Exception {
		ValidateBlogsPage.validateBreadcrumb();
		ValidateBlogsPage.validateBlogTitle();
		ValidateBlogsPage.validateBlogDate();
		ValidateBlogsPage.validateAlertMessage();
	}
}
