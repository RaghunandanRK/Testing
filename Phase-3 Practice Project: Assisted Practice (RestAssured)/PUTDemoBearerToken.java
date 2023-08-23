package in.amazon.RestAssuredDemo;

import java.util.HashMap;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PUTDemoBearerToken {
	
	HashMap<String, String> map = new HashMap<>();
	
	@BeforeMethod
	public void createPayLoad() {
		map.put("name", "Supermannnnn");
		map.put("email", "superman665544@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users/4495003";
	}
	
	@Test
	public void updateResource() {
		Response response = RestAssured
			.given()
				.contentType("application/json")
				.header("Authorization", "Bearer 1cc6338b0a3f6ecfef4a638c15983367ea11a581b7f72d8afc6a931d8f97a47c")
				.body(map)
			.when()
				.put()
			.then()
				//.statusCode(200)
				//.log().all();
				.extract().response();
		
		JsonPath jsonPath = response.jsonPath();
		Assert.assertTrue(jsonPath.get("name").toString().equals("Supermannnnn"));
		}

}
