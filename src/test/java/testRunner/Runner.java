package testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\LENOVO\\eclipse-workspace\\com.Hybrid_Framework\\src\\test\\resources\\Features\\Product_Details.feature", 
glue = {"stepdefinations", "Hooks"},
tags = "@smoke and not @skip",
dryRun = false,
plugin = {
		"pretty",
"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }
)

public class Runner extends AbstractTestNGCucumberTests {
	// This class serves as an entry point for the test execution
}