package Demo;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class UploadFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		
		// 2. Maximize it
		driver.manage().window().maximize();
		
		driver.get("https://www.remove.bg/");
		
		driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[2]/div[1]/div/div/div/div[2]/div[2]/button")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("resources//Fileupload.exe");

	}

}
