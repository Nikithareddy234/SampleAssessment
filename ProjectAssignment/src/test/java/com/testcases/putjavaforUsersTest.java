package com.testcases;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class putjavaforUsersTest {
	
	
	@Test
    public void aCarGoesIntoTheGarage() {
        Map<String,String> addusers = new HashMap<>();
        addusers.put("38", "sample1");
        addusers.put("39", "sample2");
        addusers.put("40", "sample3");

        given()
        .contentType("application/json")
        .body(addusers)
        .when().post("/users").then()
        .statusCode(200);
    }

}
