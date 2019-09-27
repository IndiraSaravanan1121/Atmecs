package com.atmecs.Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.atmecs.BrowserSetup.BrowserSetup;

public class ActionClass extends BrowserSetup {
	Actions actions = new Actions(driver);

	public void contextClick(String element) {
		WebElement elements=driver.findElement(By.xpath(element));
		actions.contextClick(elements).perform();
	}

	public void doubleClick(String element) {
		WebElement elements=driver.findElement(By.xpath(element));
		actions.contextClick(elements).perform();
	}
}
