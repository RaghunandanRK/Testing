package in.amazon.RestAssuredDemo;

import java.util.HashMap;
import java.util.UUID;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BearerTokenDemo {
	
	HashMap<String, String> map = new HashMap<String, String>();
	UUID uuid = UUID.randomUUID();
	
	@BeforeMethod
	public void createPayLoad() {
		map.put("name", "Superman");
		map.put("email", uuid+"@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users";
	}
	
	@Test
	public void createResource() {
		RestAssured
			.given()
				.contentType("application/json")
				.body(map)
				.header("Authorization", "Bearer 1cc6338b0a3f6ecfef4a638c15983367ea11a581b7f72d8afc6a931d8f97a47c")
			.when()
				.post()
			.then()
				.statusCode(201)
				.log().all();
	}

}
