package in.amazon.JenkinsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitleTest {
	WebDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		// open the browser
		//driver =new EdgeDriver(); //Class object = new
		String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("win")){			
			driver = new ChromeDriver();
		}
		    
		else if (os.contains("nix") || os.contains("aix") || os.contains("nux")){
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless=new");	
			options.addArguments("--remote-allow-origins=*");		
			driver = new ChromeDriver(options);
		}
		
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
