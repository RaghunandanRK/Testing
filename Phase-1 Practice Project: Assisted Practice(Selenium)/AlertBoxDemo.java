package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		
		// 2. Maximize it
		driver.manage().window().maximize();
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		
		driver.findElement(By.id("Button2")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();

	}

}
