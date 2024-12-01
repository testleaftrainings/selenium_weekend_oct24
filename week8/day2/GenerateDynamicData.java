package week8.day2;

import java.util.Locale;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class GenerateDynamicData {

	
	@Test
	public void generateTestData() {
		
		Faker fake = new Faker(new Locale("eng", "INDIA"));
		String fullName = fake.name().fullName();
		String firstName = fake.name().firstName();
		String lastName = fake.name().lastName();
		String emailId = firstName+lastName+"@testleaf.com";
		String phoneNumber = fake.phoneNumber().phoneNumber();
		System.out.println("Full name --> "+fullName);
		System.out.println("First name --> "+ firstName);
		System.out.println("Last name --> "+ lastName);
		System.out.println("Email id --> "+ emailId);
		System.out.println("Phone number --> "+ phoneNumber);
		
		
	}
	
	
}
