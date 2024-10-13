package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	
	public static void main(String[] args) {
		
		//literal way--> dataType variableName = {value with , separation};
		
		long[] phNo = {8925411174l,8925411175l,8925411176l,8925411173l, 8925411174l};
//		Arrays --> accept duplicate values, 
		// length is a property to get the length of the Array
		
		int length = phNo.length;
		System.out.println(length);
		//How to get particular value from the Array? By using index, index will be starts from zero
		// varaible[index]
		System.out.println(phNo[4]);
		System.out.println("Print all the phone number");
		for (int i = 0; i < length; i++) {
			System.out.println(phNo[i]);
		}
		
		//How to sort an Array? Arrays.sort(arrayVariableName)
		Arrays.sort(phNo);
		System.out.println("Phone number after sort");
		for (int i = 0; i < phNo.length; i++) {
			System.out.println(phNo[i]);
		}
		
		long[] clone = phNo.clone();
		//to get last index from an array --> length -1
		
		//8925411173, 8925411174 ,8925411174 ,8925411175 , 8925411176
		// To get the duplicate phone number
		// step 1: iterate an array
		for (int i = 0; i < phNo.length-1; i++) {
			//Step 2: Check for duplicate phone number
			if(phNo[i]==phNo[i+1]) {
				System.out.println("Duplicate phone number is "+phNo[i]);
				break;// break is a keyword , it stop the loop
			}
		}
	}
	
	
}
