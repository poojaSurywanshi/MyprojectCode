package com.stepdefination;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.tKyd.Keyword;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	private static final
	
	Logger LOG = Logger.getLogger(Hooks.class);

	RemoteWebDriver driver;
	ThreadLocal<RemoteWebDriver> thread = new ThreadLocal<RemoteWebDriver>();
	@Before
	public void setUp() throws Exception {
		Keyword keyword = new Keyword();
		 keyword.lunchBrowser("chrome");
		keyword.luanchUrl("https://www.yesstyle.com/en/");
		LOG.info("Launched  url");
	}

	@After
	public void tearDown() throws Exception {
		Keyword.driver.quit();
	}
}