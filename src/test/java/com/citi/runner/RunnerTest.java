package com.citi.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//		features = {"src/test/resources/feature/Login.feature"}
		features = {"src/test/resources/feature/"}
		,glue = {"com.citi.steps","com.citi.base"}
		,dryRun = false
		,publish = false
		,plugin = {"html:target/cucumber-report.html"}
		,tags = "@patient"
		)
public class RunnerTest extends AbstractTestNGCucumberTests {

	
}
