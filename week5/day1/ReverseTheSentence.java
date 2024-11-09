package week5.day1;

public class ReverseTheSentence {

	
	public static void main(String[] args) {
		
		String input = "Learn Selenium WebDriver with Java Language binding";
		String expectedOutput ="binding Language Java with WebDriver Selenium Learn";
		String actualOutput =" ";
		//convert the input into String[] by space
		String[] eachWords = input.split(" ");
		for(int i= eachWords.length-1; i>=0; i--) {
			actualOutput= actualOutput+eachWords[i]+" ";
		}
		//to remove the whitespace before and after the string 
		actualOutput=actualOutput.trim();
		System.out.println(actualOutput);
		if(expectedOutput.equals(actualOutput)) {
			System.out.println("Expected Output is correct");
		}else {
			System.out.println("Expected Output is incorrect");
		}
		
	}
	
	
}
