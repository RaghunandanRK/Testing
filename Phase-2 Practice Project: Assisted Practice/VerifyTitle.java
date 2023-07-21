package demo;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitle {
	EdgeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		// open the browser
		driver =new EdgeDriver(); //Class object = new
		
		//navigate to application
		//object.method()
		driver.get("https://facebook.com");
	}
	
	@Test
	public void titleVerification() {
		
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
