package log4jDemo;

import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.UUID;

//import org.junit.Assert;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class LessonEnd {
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	UUID uuid = UUID.randomUUID();
	int id;
	Response response;
	JsonPath jsonPath;
	
	@Test(priority=0)
	public void createPayLoad() {
		map.put("name", "Chillman");
		map.put("job", "Driver");
//		map.put("email", uuid+"@gmail.com");
//		map.put("gender", "male");
//		map.put("status", "active");
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/users";
	}
	
	@Test(priority=1)
	public void createResource() {
		response = RestAssured
				.given()
					.contentType("application/json")
					.body(map)
					//.header("Authorization", "Bearer 1cc6338b0a3f6ecfef4a638c15983367ea11a581b7f72d8afc6a931d8f97a47c")
				.when()
					.post()
				.then()
					.statusCode(201)
					.log().all()
					.extract().response();
		jsonPath = response.jsonPath();
		id = jsonPath.getInt("id");
		System.out.println(id);
	}
	
	@Test(priority = 2)
	public void verifyResource() {
		System.out.println("ID = " + id);
//		RestAssured
		Response response = RestAssured
			.given()
				.contentType("application/json")
			.when()
	            .get("https://reqres.in/api/users/"+ id);
//			.then()
//				.statusCode(200)
//				.log().all();
	    response.then()
        .statusCode(200)
        .log().all();
	    
	    System.out.println(response.getBody().asString());
		
		}
	
	@Test(priority=3)
	public void updateResource() {
		
		map.put("name", "CaptainPlanet");
		map.put("job", "Painter");
//		map.put("email", uuid+"@gmail.com");
//		map.put("gender", "male");
//		map.put("status", "active");
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/users/"+id;
		
		RestAssured
			.given()
				.contentType("application/json")
				//.header("Authorization", "Bearer 1cc6338b0a3f6ecfef4a638c15983367ea11a581b7f72d8afc6a931d8f97a47c")
				.body(map)
			.when()
				.put()
			.then()
				.statusCode(200)
				.log().all()
				.assertThat()
				.body("name", is("CaptainPlanet"));
	}
	
	@Test(priority=4)
	public void deleteResource() {
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/users/"+id;
		
		RestAssured
			.given()
				.contentType("application/json")
				//.header("Authorization", "Bearer 1cc6338b0a3f6ecfef4a638c15983367ea11a581b7f72d8afc6a931d8f97a47c")	
			.when()
				.delete()
			.then()
				.statusCode(204);
	}

	
}
