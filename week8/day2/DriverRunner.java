package week8.day2;

import org.testng.annotations.Test;

public class DriverRunner extends LearnThreadLocal{

	@Test
	public void runTest() {
		System.out.println(getX());
		setX(7);
		System.out.println(getX());
		
		setDriverType("Chrome");
		System.out.println(getDriverType());
		setDriverType("Edge");
		System.out.println(getDriverType());
	}
	
}
