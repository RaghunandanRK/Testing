package in.amazon.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETDemoBearerToken {
	
	@Test
	public void verifyResource() {
		RestAssured
			.given()
				.contentType("application/json")
				.header("Authorization", "Bearer 1cc6338b0a3f6ecfef4a638c15983367ea11a581b7f72d8afc6a931d8f97a47c")
			.when()
				.get("https://gorest.co.in/public/v2/users/4495003")
			.then()
				.statusCode(200)
				.log().all();
		}

}
