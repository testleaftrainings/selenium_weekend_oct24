package week1.day2;

public class CheckTheNumberOddOrEven {

	
	
	public static void main(String[] args) {
		
		int x =10;
		
		if(x%2==0) {
			System.out.println("The number "+x +" is even");
		}else {
			System.out.println("The number "+x+" is Odd");
		}
		x++; // x = x+1 --> x = 10 +1 = 11
		System.out.println(x);
		System.out.println(x++);//postCondition x++ will print the value first and then add x with 1
		System.out.println(x);
		System.out.println(++x);// preCondition first it will update the value and then it will print
	}
	
	
}
