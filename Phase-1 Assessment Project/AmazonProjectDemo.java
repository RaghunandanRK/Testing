package Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonProjectDemo {

	public static void main(String[] args) {
        // Create a new instance of EdgeDriver
        EdgeDriver driver = new EdgeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to Amazon.in
        driver.get("https://www.amazon.in/");

        // Click on 'Mobiles' in the navigation bar
        WebElement mobilesLink = driver.findElement(By.linkText("Mobiles"));
        mobilesLink.click();

        // Hover the pointer over 'Mobiles & Accessories'
        WebElement mobilesAccessoriesMenu = driver.findElement(By.id("nav-subnav"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mobilesAccessoriesMenu).build().perform();

        // Click on 'Apple' in the sub-menu
        WebElement appleLink = driver.findElement(By.linkText("Apple"));
        appleLink.click();

        // Click on the first available phone
        driver.findElement(By.linkText("Apple iPhone 14 (128 GB) - Blue")).click();

        // Switch focus to the new tab
        String currentTab = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }

        // Click on 'Buy Now' button
        WebElement buyNowButton = driver.findElement(By.id("buy-now-button"));
        buyNowButton.click();

        // Verify if the user sees the text 'Sign in' on the last page
        WebElement signInText = driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div[2]/div[1]/form/div/div/div/h1"));
        if (signInText.isDisplayed()) {
            System.out.println("User sees the text 'Sign in' on the last page.");
        } else {
            System.out.println("User does not see the text 'Sign in' on the last page.");
        }

        // Close the browser
        driver.quit();
	}

}
