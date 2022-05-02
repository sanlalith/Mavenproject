package org.runallclass;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.sample.JVMReport;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//only package name alone need give here
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles",glue="org.sample",monochrome=true,dryRun=false,strict=true,
plugin = {"html:C:\\Users\\sangeetha\\eclipse\\eclipse-workspace\\cucumberFramework\\AllReports\\HTMLReport",
		  "json:C:\\Users\\sangeetha\\eclipse\\eclipse-workspace\\cucumberFramework\\AllReports\\jsonReport\\facebook.json",
		  "junit:C:\\Users\\sangeetha\\eclipse\\eclipse-workspace\\cucumberFramework\\AllReports\\junitReport\\fb.xml"
} )

public class TestRunner
{
   @AfterClass
	
	public static void report()
	{
		JVMReport.generateJvmReport(System.getProperty("user.dir")+"\\AllReports\\jsonReport\\facebook.json");
		
	}
	
}





