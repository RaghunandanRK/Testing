package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioBtnAndCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		
		// 2. Maximize it
		driver.manage().window().maximize();
		
		// 3. Navigate to application
		driver.get("https://letcode.in/radio");
		
		driver.findElement(By.id("yes")).click();
		
		driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[2]")).click();

	}

}
