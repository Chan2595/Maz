package com.abinbev.carina.demo;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberBaseTest;
import com.qaprosoft.carina.core.foundation.report.ReportContext;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
tags= "@MazDemo",        
glue = "com.abinbev.carina.demo.cucumber.steps",
plugin={"pretty",
		"html:target/cucumber-core-test-report",
		"pretty:target/cucumber-core-test-report.txt",
		"json:target/cucumber-core-test-report.json",
"junit:target/cucumber-core-test-report.xml"},
monochrome= true
		)
public class CucumberWebSampleTest extends CucumberBaseTest {
	
	@BeforeSuite
	public void batchFile() throws IOException {
	    Runtime.getRuntime().exec("cmd.exe /C start \"start-selenium\" \".\\carina-start\\start-selenium.bat\"");
	    LOGGER.info("The selenium server is up and running");
	}

	@AfterSuite(alwaysRun = true)
	public void tearDownClass(ITestContext context) throws Exception {
	    Runtime.getRuntime().exec("cmd.exe /C start \"kill-selenium-cmd\" \".\\carina-start\\kill-selenium-cmd.bat\"");
	    LOGGER.info("The selenium server closed.");
	}
}
