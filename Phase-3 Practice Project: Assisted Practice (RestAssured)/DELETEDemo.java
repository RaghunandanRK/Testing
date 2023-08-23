package in.amazon.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DELETEDemo {
	
	@Test
	public void deleteResource() {
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api/users/744";
		
		RestAssured
			.when()
				.delete()
			.then()
				.statusCode(204);
	}

}
