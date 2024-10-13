package week1.day2;

public class CheckPostiveNumber {

	
	public static void main(String[] args) {
		//Syntax for if condition: if(boolen condition or value){}
		if(2!=2) {
			System.out.println("If condition is satisfied");
		}
		//When the boolen value is true, then the condition get satisfied
		
		int num = 7;
		if(num>0) {
			System.out.println("The number "+num+" is postivie");
		}
		
		// range of number -7 to 7
		int a = 7;
		
		if(a==0) {
			System.out.println("The number "+ a + " is netural");
		}else if(a>0) {
			System.out.println("The number "+ a + " is positive");
		}else{
			System.out.println("The number "+ a + " is negative");
		}
		
	}
	
	
}
