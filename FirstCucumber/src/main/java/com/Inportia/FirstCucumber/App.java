package com.Inportia.FirstCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
(
	features= "Features",
	glue    = "com/Inportia/FirstCucumber/stepDefiniations",
	plugin  = {"pretty","html:target/cucumber","json:target_json/cucumber.json" }
	
			
	
)
public class App 
{
    
}
