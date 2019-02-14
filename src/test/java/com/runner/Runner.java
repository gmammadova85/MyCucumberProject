package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(dryRun = false,
		// tags = {"@Test"},
		monochrome = true, features = "./src/test/resources/features"
// glue = "./src/test/java/stepDefinition"

)

public class Runner {

}
