package log4jDemo;

import java.util.HashMap;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredProject {
	
	public static RequestSpecification httpRequest;
	public Logger logger;
	
	HashMap<String, String> map = new HashMap<String, String>();
	int id;
	Response response;
	JsonPath jsonPath;
	
	@BeforeMethod
	public void setUp() {
		RestAssured.baseURI = "https://reqres.in/";
		logger = Logger.getLogger("LogDemo");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
	}
	
	@Test(priority=0)
	public void testGetUsers() {
		RestAssured
			.given()
			.when()
				.get("https://reqres.in/api/users")
			.then()
				.statusCode(200)
				.log().all();
		logger.info("Resource Verified Successfully");
	}
	
	@Test(priority=0)
	public void testRegisterUser() {
		map.put("name", "morpheus");
		map.put("job", "painter");
		
		response = RestAssured
			.given()
				.contentType(ContentType.JSON)
				.body(map)
			.when()
				.post("/api/users")
			.then()
				.statusCode(201)
				.extract().response();
				//.log().all();
		jsonPath = response.jsonPath();
		id = jsonPath.getInt("id");
		logger.info("Response Created Successfully");
	}
	
}
