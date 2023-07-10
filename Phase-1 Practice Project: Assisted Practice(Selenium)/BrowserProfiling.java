package Demo;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserProfiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-notifications");
		
		EdgeDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://yatra.com");

	}

}
