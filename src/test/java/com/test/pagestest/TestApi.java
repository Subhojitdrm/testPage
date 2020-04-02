package com.test.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestApi {

	@Test
	public void testGetStatus() {
		
		RestAssured.baseURI="https://firefox.informer.com/";
		RequestSpecification httpRequest= RestAssured.given();
		Response response= httpRequest.request(Method.GET,"download/");
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}
	
	
}
