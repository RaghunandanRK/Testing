package in.amazon.testscripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;

public class BuyMobilePhoneTest {
	WebDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		//1. Open the Browser
		driver = new EdgeDriver();
		
		//2. maximize it
		driver.manage().window().maximize();
		
		//3. Navigate to https://www.amazon.in/
		driver.get("https://amazon.in");
	}
	
	@Test
	public void buyMobile() {
		//4. click on 'Mobile' in the navigation bar
		LandingPage landingPage = new LandingPage(driver); //Class object = new class();
		landingPage.clickMobiles(); //object.method()
		
		//5. Hover the pointer over 'Mobiles & Accessories'
		AllMobileBrands allMobilesBrands = new AllMobileBrands(driver);
		allMobilesBrands.hoverOverMobilesAndAccessories();
		
		//6. Click on 'Apple' in the sub-menu
		allMobilesBrands.clickApple();
		
		//7. Click on first available phone
		ApplePhones applePhones = new ApplePhones(driver);
		applePhones.clickFirstMobile();
		
		//8. Switch focus on new tab
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		//9. Click on 'Buy Now' button
		BuyPhone buyPhone = new BuyPhone(driver);
		buyPhone.clickBuyNowBtn();
		
		//10. Verify user sees the text 'Sign in' on the last page.
		SignIn signIn = new SignIn(driver);
		String expectedText = "Sign in";
		String actualText = signIn.getSignInText();
		Assert.assertEquals(actualText, expectedText);
		
	}
	
//	@AfterTest
//	public void closeBrowser() {
//		driver.quit();
//	}

}
