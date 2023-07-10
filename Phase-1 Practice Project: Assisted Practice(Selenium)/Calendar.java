package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		
		// 2. Maximize it
		driver.manage().window().maximize();
		
		driver.get("https://www.expedia.co.in/");
		
		driver.findElement(By.id("date_form_field-btn")).click();
		
		WebElement nextMonth = driver.findElement(By.xpath("(//table[contains(@class, 'weeks')])[2]"));
		List<WebElement>rows = nextMonth.findElements(By.tagName("tr"));
		
		for(int i = 1; i<rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> columns = row.findElements(By.tagName("button"));
			
			for(WebElement x : columns) {
				if(x.getAttribute("data-day").equals("9")) {
					x.click();
					break;
				}
			}
		}
		driver.findElement(By.xpath("//button[contains(@data-stid, 'apply-date')]")).click();

	}

}
