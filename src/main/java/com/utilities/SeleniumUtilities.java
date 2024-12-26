package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.utilities.SeleniumUtilities;

public class SeleniumUtilities {

	public static WebDriver OpenBrowser() {

		WebDriver driver = new ChromeDriver();
		return driver;

	}

	public static void ClickButton(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();

	}

	public static void GetAnyUrl(WebDriver driver, String url) {
		driver.get(url);
	}

	public static void EnterText(WebDriver driver, String xpath, String data) {
		driver.findElement(By.xpath(xpath)).sendKeys(data);
	}

	public static String GetAnyText(WebDriver driver, String xpath) {
		String Text = driver.findElement(By.xpath(xpath)).getText();
		return Text;
	}
	

}
