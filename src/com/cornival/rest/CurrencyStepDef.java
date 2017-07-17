package com.cornival.rest;

import org.junit.Assert;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;


@ScenarioScoped
public class CurrencyStepDef {

    Response response;	 
	
	@When("^the cleint calls countries url$")
    public void clientcallscurrencyconvert() throws Throwable {
		response = RestAssured.get("http://restcountries.eu/rest/v2/all");
		//System.out.println("Status"+response.prettyPrint()); 
		
    }
	
	@Then("^the client receives the status code of (\\d+)$")
	public void the_client_receives_the_status_code_of(int status) throws Throwable {
		 Assert.assertEquals(200, response.getStatusCode());
	}

	 
}
