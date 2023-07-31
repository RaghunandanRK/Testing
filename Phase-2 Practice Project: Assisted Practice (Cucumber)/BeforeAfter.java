package in.amazon.teststeps;

import in.amazon.testscripts.Tools;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends Tools {
	
	@Before
	public void setUp(Scenario scenario) {
		Driver.init();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
