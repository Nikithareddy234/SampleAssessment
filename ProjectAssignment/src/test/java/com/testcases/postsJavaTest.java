package com.testcases;

import static com.jayway.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.containsString;

import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

public class postsJavaTest extends FunctionalTest {
	

	    @Test
	    public void basicPingTest() {
	        given().when().get("/posts").then().statusCode(200);
	    }
	    
	    //Negative Test
	    
	    @Test
	    public void invalidpostsurlTest() {
	        given().when().get("/pos").then().statusCode(404);
	    }
	    
	    
	    @Test
	    public void verifyNameOfGarage() {
	        given().when().get("/posts").then()
	            .body(containsString("suscipit"));
	    }
	    
	    
	    //Negative Test
	    
	    @Test
	    public void verifyNameOfGarageNegativeTest() {
	        given().when().get("/posts").then()
	            .body(containsString("xxxx"));
	    }
	    
	    
	    
	    
	    

	}


