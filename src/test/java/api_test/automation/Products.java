package api_test.automation;

import static com.jayway.restassured.RestAssured.expect;

import org.junit.Test;

import com.jayway.restassured.response.Response;

public class Products {

	@Test
	public void testGetGeoPoints() {

		Response response = expect().statusCode(200).when()
				.get("https://www.telize.com/geoip?callback");
		response.getBody().prettyPrint();

	}

	@Test
	public void testGetCurrencyDeflator() {

		Response response = expect()
				.statusCode(200)
				.when()
				.get("https://qrng.anu.edu.au/API/jsonI.php?length=1&type=uint8");
		response.getBody().prettyPrint();

	}

}