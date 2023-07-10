package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class DropDownDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		
		// 2. Maximize it
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement languages = driver.findElement(By.id("lang"));
		Select select = new Select(languages);
		select.selectByVisibleText("Java");

	}

}
