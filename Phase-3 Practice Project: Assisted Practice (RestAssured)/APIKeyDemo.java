package in.amazon.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class APIKeyDemo {
	
	@Test
	public void getWeatherInfo() {
		RestAssured
			.given()
				.param("q", "chennai")
				.param("appid", "80c7d67902d587e5f685035a865ad645")
			.when()
				.get("https://api.openweathermap.org/data/2.5/weather")
			.then()
				.statusCode(200)
				.log().all();
	}

}
