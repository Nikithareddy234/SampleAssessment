package com.testcases;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;


public class RestAssuredTest {
	
		
	//This TestNG test connects to website, performs a GET call and makes sure that HTTP code 200/success is returned. Notice the complete absence of the 
	//usual TestNG assert statements. REST Assured takes care of this for us and will automatically 
	//pass/fail this test according to the error code.
	
	@Test
	
	 public void makeSureThatWebsiteIsUp() {
		
		given().when().get("http://ec2-54-174-213-136.compute-1.amazonaws.com:3000/").then().statusCode(200);
		
	}
	

}
