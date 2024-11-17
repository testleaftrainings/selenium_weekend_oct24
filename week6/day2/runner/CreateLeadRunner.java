package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src/test/java/features/Login.feature","src/test/java/features/CreateLeadWithDynamicInputs.feature"},
				 glue = {"stepDef"},// step definition location
				 publish = true,
				 monochrome = true)
public class CreateLeadRunner extends AbstractTestNGCucumberTests{ 

}

