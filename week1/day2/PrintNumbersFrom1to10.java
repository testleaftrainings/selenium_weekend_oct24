package week1.day2;

public class PrintNumbersFrom1to10 {

	
	public static void main(String[] args) {
		
		/*
		 * System.out.println(1); System.out.println(2); System.out.println(3);
		 * System.out.println(4);
		 */
		
		// syntax for --> for(initalization; loop condition(when to stop the loop); increment/decrement)
		System.out.println("-------------Print number from 1 to 10-------------");
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
		// Print Even numbers from 1 to 10
		//shortcut to generate for loop -->
						// type for and do ctrl + spacebar and choose the second option
		System.out.print("\nThe values are ");
		for (int i = 0; i <11; i++) {
			//condition to skip the iteration
			if(i==4) {
				continue;// continue is a keyword , it will skip the current iteration
			}
			//condition to check the number is even
			if(i%2==0) {
				System.out.print(i+", ");
			}
		}
		
	}
	
	
}
