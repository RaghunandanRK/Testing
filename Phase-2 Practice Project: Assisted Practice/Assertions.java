package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	SoftAssert soft = new SoftAssert();
	WebDriver driver;
	@Test
	public void Launch() {
		System.setProperty("webdriver.edge.driver", "./Resources/msedgedriver.exe");
		driver = new EdgeDriver();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(dependsOnMethods = { "Launch" })
	public void Facebook() {
		driver.get("https://www.facebook.com");
		soft.assertEquals("FB Title", driver.getTitle());	
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods = { "Facebook" })
	public void Login() {
		driver.findElement(By.id("email")).sendKeys("batman55446677@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345000000");
		driver.findElement(By.name("login")).click();
		soft.assertAll();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
