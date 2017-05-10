package com.testcases;


import org.testng.annotations.BeforeClass;

import com.jayway.restassured.RestAssured;

public class FunctionalTest {

    @BeforeClass
    public static void setup() {
        String port = System.getProperty("server.port");
        if (port == null) {
            RestAssured.port = Integer.valueOf(3000);
        }
        else{
        	RestAssured.port = Integer.valueOf(port);
        }



        String baseHost = System.getProperty("server.host");
        if(baseHost==null){
            baseHost = "http://ec2-54-174-213-136.compute-1.amazonaws.com";
        }
        RestAssured.baseURI = baseHost;

    }

}