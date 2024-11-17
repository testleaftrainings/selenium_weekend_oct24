package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src/test/java/features/Login.feature"},// features - location of the feature file
				 glue = {"stepDef"}, // glue - location of step definition
				 publish = true, // publish - default value is false , which helps to generate cucumber report
				 monochrome = true) // monochrome - default value is false, which helps to remove junk character or unwanted logs in the console and report
public class LoginRunner extends AbstractTestNGCucumberTests{ 

}


