package com.test.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TestApi_02 {
	
	@Test
	public void testTheStatus() {
		RestAssured.baseURI="https://www.google.com/search";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET,"?q=selenium+interview+questions&oq=selenium+in&aqs=chrome.0.35i39j69i57j35i39j0l2j69i60l2j69i61.3486j0j4&sourceid=chrome&ie=UTF-8");
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
