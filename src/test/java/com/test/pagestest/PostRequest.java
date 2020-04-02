package com.test.pagestest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	@Test
	public void testPostRequest() {
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();

		// JSONObject is a class that represents a Simple JSON.
		// We can add Key - Value pairs using the put method
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Virender");
		requestParams.put("LastName", "Singh");

		requestParams.put("UserName", "simpleuser001");
		requestParams.put("Password", "password1");
		requestParams.put("Email", "someuser@gmail.com");
		request.header("Content-Type", "application/json");

		// Add the Json to the body of the request
		request.body(requestParams.toJSONString());

		// Post the request and check the response
		Response response = request.post("/register");

		int statusCode = response.getStatusCode();
		System.out.println(response.getStatusLine());
		Assert.assertEquals(statusCode, "201");
		

	}

}
