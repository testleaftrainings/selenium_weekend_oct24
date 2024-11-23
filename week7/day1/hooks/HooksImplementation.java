package hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepDef.ProjectSpecificMethod;

public class HooksImplementation extends ProjectSpecificMethod{


//	@Before
	public void preCondition() {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
	}

//	@After
	public void postCondition() {
		driver.quit();
	}

	
}
