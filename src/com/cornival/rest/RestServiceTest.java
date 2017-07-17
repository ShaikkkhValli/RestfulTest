package com.cornival.rest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/com/cornival/rest/feature/countries.feature", plugin="json:target/countries-report.json")
public class RestServiceTest {

}
	