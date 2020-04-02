package com.test.basttest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestApi {
	
	@Test
	public void validateStatusCode() {
		
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weatherfull/city";
		RequestSpecification httpRequest=RestAssured.given();
		Response response =httpRequest.request(Method.GET,"/Hyderabad");
		System.out.println(response.getBody().asString());
	}
	@Test
	public void validateStatusCode1() {
		
		RestAssured.baseURI="https://blog.hubspot.com/marketing";
		//RequestSpecification httpRequest=RestAssured.given();
		//Response response =httpRequest.request(Method.GET,"/best-website-designs-list");
		System.out.println(RestAssured.given().request(Method.GET,"/best-website-designs-list").getStatusCode());
		//RestAssured.given().request(Method.GET,"/best-website-designs-list").getStatusCode();
	}


}
