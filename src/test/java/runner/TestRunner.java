package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",
glue = "com.stepdefination", 
dryRun = false,
plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }) // and or not
public class TestRunner {
}

/*
public class TestRunner extends AbstractTestNGCucumberTests {
@DataProvider(parallel = true)
@Override
public Object[][] scenarios() {
	return super.scenarios();
}
}*/