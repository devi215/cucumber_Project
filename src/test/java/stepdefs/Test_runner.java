package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		//monochrome= true,
		//plugin={"pretty","html:target/cucumber-report","json:target/cucumber-report.json"},
		features = "src/test/java/feature", 
		glue = "stepdefs"
		//tags = {"@sanity"}
		//tags = {"not @ignore"}  // it will ignore all the @ignore scenarios and rest all will be executed
		//tags = {"@login"}  // it will run all the scenarios in login feature file
		//tags = {"@sanity or @regression"} // it will execute all the scenarios with @sanity or @regression
		//tags = {"@sanity and @regression"} // it will execute all the scenarios with @sanity and @regression boh
		)


public class Test_runner {

}
