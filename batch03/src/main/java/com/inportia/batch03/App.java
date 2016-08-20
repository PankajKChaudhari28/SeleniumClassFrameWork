package com.inportia.batch03;

import org.junit.runner.RunWith;

import com.inportia.edmodoBatch02.CucumberOptions;

/**
 * Hello world!
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "Features",
		glue     = "com/inportia/stepDefinitions",
		tags      = { "@wip" , "~@skip" },
	    format = { "pretty", "html:target/cucumber", "json:target_json/cucumber.json"}
	)
public class App 
{
   
}
