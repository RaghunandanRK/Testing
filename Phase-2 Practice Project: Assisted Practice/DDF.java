package in.amazon.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;
import utils.ReadExcel;

public class DDF extends BaseTest {
	
	@Test
	public void verifyErrorMsg() throws IOException {
		//4. Hover the pointer over 'Hello Sign-in, menu
		LandingPage landingPage = new LandingPage(driver);
		landingPage.hoverOverHelloSignInMenu();
		
		//5. Click on 'Sign-in' button in the sub-menu
		landingPage.clickSignInBtn();
		
		String[][] data = ReadExcel.getData("resources//TestData.xlsx", "Sheet1");
		
		
		for(int i = 1; i < data.length ; i++) {
			String username = data[i][1];
			//6. Enter invalid username in the email textbox
			SignIn signIn = new SignIn(driver);
			signIn.enterEMail("username");
			
			//7. click on 'Continue' button
			signIn.clickContinueBtn();
			
			//8. Verify the error message
			String expectedErrMsg = "We cannot find an account with that email address";
			String actualErrMsg = signIn.getErrMsg();
			Assert.assertEquals(actualErrMsg, expectedErrMsg);
		}
		
	}	

}
