package com.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utilities.SeleniumUtilities;

public class LoginTestCase {
	@Test(priority = 1)
	public void CheckHeading1() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/index.php?route=account/login");
		driver.manage().window().maximize();
		String Actual = SeleniumUtilities.GetAnyText(driver, "//*[@id=\"content\"]/div/div[1]/div/h2");
		String Expected = "New Customer";

		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 2)
	public void CheckHeading2() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/index.php?route=account/login");
		driver.manage().window().maximize();
		String Actual = SeleniumUtilities.GetAnyText(driver, "//*[@id=\"content\"]/div/div[2]/div/h2");
		String Expected = "Returning Customer";

		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 3)
	public void CheckHeading3() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/index.php?route=account/login");
		driver.manage().window().maximize();
		String Actual = SeleniumUtilities.GetAnyText(driver, "//*[@id=\"content\"]/div/div[2]/div/p/strong");
		String Expected = "I am a returning customer";

		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 4)
	public void CheckInvalidLogin() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/index.php?route=account/login");
		driver.manage().window().maximize();

		String emailxpath = "//*[@id=\"input-email\"]";
		String passwordxpath = "//*[@id=\"input-password\"]";
		String loginxpath = "//*[@id=\"content\"]/div/div[2]/div/form/input";
		SeleniumUtilities.EnterText(driver, emailxpath, "justeve1157@gmail.com");
		SeleniumUtilities.EnterText(driver, passwordxpath, "justeve777");
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		loginbutton.click();

		String Actual = driver.getTitle();
		String Expected = "Account Login";

		Assert.assertEquals(Actual, Expected);
		driver.quit();
	}

	@Test(priority = 5)
	public void CheckLogin() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/index.php?route=account/login");
		driver.manage().window().maximize();

		String emailxpath = "//*[@id=\"input-email\"]";
		String passwordxpath = "//*[@id=\"input-password\"]";
		String loginxpath = "//*[@id=\"content\"]/div/div[2]/div/form/input";
		SeleniumUtilities.EnterText(driver, emailxpath, "justeve1157@gmail.com");
		SeleniumUtilities.EnterText(driver, passwordxpath, "justeve@777");
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		loginbutton.click();

		String Actual = driver.getTitle();
		String Expected = "My Account";

		Assert.assertEquals(Actual, Expected);
		// driver.quit();

	}

	@Test(priority = 6)
	public void CheckMacbook() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/index.php?route=common/home");
		driver.manage().window().maximize();
		String mac = "//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a";
		SeleniumUtilities.ClickButton(driver, mac);

		String Actual = driver.getTitle();
		String Expected = "MacBook";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 7)
	public void AddtoCart() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/index.php?route=common/home");
		driver.manage().window().maximize();
		String Cart = "//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]";
		SeleniumUtilities.ClickButton(driver, Cart);

		String Actual = driver.getTitle();
		String Expected = "Your Store";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 8)
	public void CheckSearchBox() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/index.php?route=common/home");
		driver.manage().window().maximize();
		String SBox = "//*[@id=\"search\"]/input";
		SeleniumUtilities.ClickButton(driver, SBox);

		String Actual = driver.getTitle();
		String Expected = "Your Store";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 9)
	public void CheckContact() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String call = "//*[@id=\"top-links\"]/ul/li[1]/a";
		SeleniumUtilities.ClickButton(driver, call);

		String Actual = driver.getTitle();
		String Expected = "Contact Us";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 10)
	public void CheckWishList() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String WishList = "//*[@id=\"wishlist-total\"]";
		SeleniumUtilities.ClickButton(driver, WishList);

		String Actual = driver.getTitle();
		String Expected = "Account Login";
		Assert.assertEquals(Actual, Expected);
		driver.quit();
	}

	@Test(priority = 11)
	public void CheckPhones() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Button = "//*[@id=\"menu\"]/div[2]/ul/li[6]/a";
		SeleniumUtilities.ClickButton(driver, Button);

		String Actual = driver.getTitle();
		String Expected = "Phones & PDAs";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 12)
	public void CheckTablet() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Button = "//*[@id=\"menu\"]/div[2]/ul/li[4]/a";
		SeleniumUtilities.ClickButton(driver, Button);

		String Actual = driver.getTitle();
		String Expected = "Tablets";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 13)
	public void CheckCamera() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String CamButton = "//*[@id=\"menu\"]/div[2]/ul/li[7]/a";
		SeleniumUtilities.ClickButton(driver, CamButton);

		String Actual = driver.getTitle();
		String Expected = "Cameras";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 14)
	public void CheckMP3() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String MP3utton = "//*[@id=\"menu\"]/div[2]/ul/li[8]/a";
		SeleniumUtilities.ClickButton(driver, MP3utton);
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[8]/div/a"));
		WE.click();

		String Actual = driver.getTitle();
		String Expected = "MP3 Players";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 15)
	public void CheckLaptopsNotebooks() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String LNButton = "//*[@id=\"menu\"]/div[2]/ul/li[2]/a";
		SeleniumUtilities.ClickButton(driver, LNButton);
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a"));
		WE.click();

		String Actual = driver.getTitle();
		String Expected = "Laptops & Notebooks";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 16)
	public void CheckComponents() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String ComButton = "//*[@id=\"menu\"]/div[2]/ul/li[3]/a";
		SeleniumUtilities.ClickButton(driver, ComButton);
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/div/ul/li[2]/a"));
		WE.click();

		String Actual = driver.getTitle();
		String Expected = "Monitors";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 17)
	public void CheckComponents2() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String ComButton = "//*[@id=\"menu\"]/div[2]/ul/li[3]/a";
		SeleniumUtilities.ClickButton(driver, ComButton);
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/a"));
		WE.click();

		String Actual = driver.getTitle();
		String Expected = "Components";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 18)
	public void CheckAboutUs() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String AboutButton = "/html/body/footer/div/div/div[1]/ul/li[1]/a";
		SeleniumUtilities.ClickButton(driver, AboutButton);

		String Actual = driver.getTitle();
		String Expected = "About Us";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 19)
	public void CheckContactUs() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String ContactButton = "/html/body/footer/div/div/div[2]/ul/li[1]/a";
		SeleniumUtilities.ClickButton(driver, ContactButton);

		String Actual = driver.getTitle();
		String Expected = "Contact Us";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 20)
	public void CheckSiteMap() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String SiteButton = "/html/body/footer/div/div/div[2]/ul/li[3]/a";
		SeleniumUtilities.ClickButton(driver, SiteButton);

		String Actual = driver.getTitle();
		String Expected = "Site Map";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 21)
	public void CheckAllBrands() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String BrandButton = "/html/body/footer/div/div/div[3]/ul/li[1]/a";
		SeleniumUtilities.ClickButton(driver, BrandButton);

		String Actual = driver.getTitle();
		String Expected = "Find Your Favorite Brand";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 22)
	public void CheckwishList() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String WLButton = "/html/body/footer/div/div/div[4]/ul/li[3]/a";
		SeleniumUtilities.ClickButton(driver, WLButton);

		String Actual = driver.getTitle();
		String Expected = "My Wish List";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 23)
	public void CheckNewsletter() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String NLButton = "/html/body/footer/div/div/div[4]/ul/li[4]/a";
		SeleniumUtilities.ClickButton(driver, NLButton);

		String Actual = driver.getTitle();
		String Expected = "Newsletter Subscribtion";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 24)
	public void CheckSpecialOffers() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String SplOfButton = "/html/body/footer/div/div/div[3]/ul/li[4]/a";
		SeleniumUtilities.ClickButton(driver, SplOfButton);

		String Actual = driver.getTitle();
		String Expected = "Special Offers";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 25)
	public void CheckTermsConditions() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String TCsButton = "/html/body/footer/div/div/div[1]/ul/li[4]/a";
		SeleniumUtilities.ClickButton(driver, TCsButton);

		String Actual = driver.getTitle();
		String Expected = "Terms & Conditions";
		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 26)
	public void CheckHeading4() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Actual = SeleniumUtilities.GetAnyText(driver, "//*[@id=\"content\"]/h3");
		String Expected = "Featured";

		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 27)
	public void CheckFooter1() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Actual = SeleniumUtilities.GetAnyText(driver, "/html/body/footer/div/div/div[1]/h5");
		String Expected = "Information";

		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 28)
	public void CheckFooter2() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Actual = SeleniumUtilities.GetAnyText(driver, "/html/body/footer/div/div/div[2]/h5");
		String Expected = "Customer Service";

		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 29)
	public void CheckFooter3() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Actual = SeleniumUtilities.GetAnyText(driver, "/html/body/footer/div/div/div[3]/h5");
		String Expected = "Extras";

		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 30)
	public void CheckFooter4() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Actual = SeleniumUtilities.GetAnyText(driver, "/html/body/footer/div/div/div[4]/h5");
		String Expected = "My Account";

		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 31)
	public void CheckFooter5() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Actual = SeleniumUtilities.GetAnyText(driver, "/html/body/footer/div/p/a");
		String Expected = "OpenCart";

		Assert.assertEquals(Actual, Expected);
		driver.quit();

	}

	@Test(priority = 32)
	public void CheckSearchBoxFun1() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Sbox = "//*[@id=\"search\"]/input";
		SeleniumUtilities.EnterText(driver, Sbox, "iPhone");
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
		WE.click();

		String Actual = driver.getTitle();
		String Expected = "Search - iPhone";
		Assert.assertEquals(Actual, Expected);

		driver.quit();

	}

	@Test(priority = 33)
	public void CheckSearchBoxFun2() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Sbox = "//*[@id=\"search\"]/input";
		SeleniumUtilities.EnterText(driver, Sbox, "Ipod");
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
		WE.click();

		String Actual = driver.getTitle();
		String Expected = "Search - Ipod";
		Assert.assertEquals(Actual, Expected);

		driver.quit();

	}

	@Test(priority = 34)
	public void CheckSearchBoxFun4() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Sbox = "//*[@id=\"search\"]/input";
		SeleniumUtilities.EnterText(driver, Sbox, "sony");
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
		WE.click();

		String Actual = driver.getTitle();
		String Expected = "Search - sony";
		Assert.assertEquals(Actual, Expected);

		driver.quit();

	}

	@Test(priority = 35)
	public void CheckSearchBoxFun5() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Sbox = "//*[@id=\"search\"]/input";
		SeleniumUtilities.EnterText(driver, Sbox, "iMac");
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
		WE.click();

		String Actual = driver.getTitle();
		String Expected = "Search - iMac";
		Assert.assertEquals(Actual, Expected);

		driver.quit();
	}

	@Test(priority = 36)
	public void CheckSearchBoxFun6() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Sbox = "//*[@id=\"search\"]/input";
		SeleniumUtilities.EnterText(driver, Sbox, "Palm");
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
		WE.click();

		String Actual = driver.getTitle();
		String Expected = "Search - Palm";
		Assert.assertEquals(Actual, Expected);

		driver.quit();
	}

	@Test(priority = 37)
	public void CheckSearchBoxFun7() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Sbox = "//*[@id=\"search\"]/input";
		SeleniumUtilities.EnterText(driver, Sbox, "HP");
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
		WE.click();

		String Actual = driver.getTitle();
		String Expected = "Hewlett-Packard";
		Assert.assertEquals(Actual, Expected);

		driver.quit();
	}

	@Test(priority = 38)
	public void CheckSearchBoxFun8() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Sbox = "//*[@id=\"search\"]/input";
		SeleniumUtilities.EnterText(driver, Sbox, "Apple Cinema");
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
		WE.click();

		String Actual = driver.getTitle();
		String Expected = "Search - Apple Cinema";
		Assert.assertEquals(Actual, Expected);

		driver.quit();
	}

	@Test(priority = 39)
	public void CheckSearchBoxFun9() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Sbox = "//*[@id=\"search\"]/input";
		SeleniumUtilities.EnterText(driver, Sbox, "Canon");
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
		WE.click();

		String Actual = driver.getTitle();
		String Expected = "Search - Canon";
		Assert.assertEquals(Actual, Expected);

		driver.quit();
	}

	@Test(priority = 40)
	public void CheckSearchBoxFun10() {
		WebDriver driver = SeleniumUtilities.OpenBrowser();
		SeleniumUtilities.GetAnyUrl(driver, "https://awesomeqa.com/ui/");
		driver.manage().window().maximize();
		String Sbox = "//*[@id=\"search\"]/input";
		SeleniumUtilities.EnterText(driver, Sbox, "Nikon");
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
		WE.click();

		String Actual = driver.getTitle();
		String Expected = "Search - Nikon";
		Assert.assertEquals(Actual, Expected);

		driver.quit();
	}

}
