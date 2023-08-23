package PhaseEndProject;

import static org.hamcrest.Matchers.is;
import java.util.HashMap;
import org.junit.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Reqres extends TestBase
{
HashMap<String, String> map = new HashMap<String, String>();
	
	int id;
	Response response;
	JsonPath jsonPath;
	
	@Test(priority=0)
	public void createPayload()
	{
		map.put("name", "morpheus");
		map.put("job", "Engineer");
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api/users";
		logger.info("Payload created");
	}
	
	@Test(priority=1)
	public void createResource() {
		response = RestAssured
				.given()
					.contentType("application/json")
					.body(map)
				.when()
					.post()
				.then()
					.log().all()
					.extract().response();
		logger.info("Response Created Successfully");
		jsonPath = response.jsonPath();
		id = jsonPath.getInt("id");
		System.out.println(id);
	}
	
	@Test(priority=2)
	public void verifyResource()
	{
		System.out.println("Id = " + id);
		RestAssured
		.given()
			.contentType("application/json")
		.when()
			.get("https://reqres.in/api/users?page=2"+id)
		.then()
		    .assertThat()
		    .statusCode(200)
			.log().all();
		
		logger.info("Resource verify sucefully");
		Assert.assertTrue(jsonPath.get("name").equals("morpheus"));
	}
	
	@Test(priority=3)
	public void updateResource()
	{
		map.put("name", "morpheus");
		map.put("job", "Painter");
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api/users/" + id;
		
		RestAssured
		.given()
			.contentType("application/json")
			.body(map)
		.when()
			.put()
		.then()
			.statusCode(200)
			.log().all()
			.assertThat()
			.body("job", is("Painter"));
		
		logger.info("Resources Updated Sucessfully");
	}
	
	@Test(priority=4)
	public void deleteResource()
	{
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api/users/" + id;
		
		RestAssured
			.given()
				.contentType("application/json")
			.when()
				.delete()
			.then()
				.statusCode(204);
		
		logger.info("Resource deleted");
	
    }
}