package runner;

import io.cucumber.testng.CucumberOptions;
import stepDef.ProjectSpecificMethod;
@CucumberOptions(features = {"src/test/java/features"},
				 glue = {"stepDef"},
				 publish = true,
				 monochrome = true,
				 tags = "not @createlead")
public class CucumberRunner extends ProjectSpecificMethod{ 

}

