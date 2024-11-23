package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src/test/java/features/CreateLeadWithDynamicInputs.feature"},
				 glue = {"stepDef","hooks"},// step definition location
				 publish = true,
				 monochrome = true)
public class CreateLeadRunner extends AbstractTestNGCucumberTests{ 

}

