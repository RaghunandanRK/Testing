package demo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle 
{
	static WebDriver driver;
	
	@BeforeAll
	public static void launchApplication()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.linkedin.com/");
	}
	
	@Test
	public void verifyTitle()
	{
		String expectedTitle = "LinkedIn: Log In or Sign Up";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
	}

}