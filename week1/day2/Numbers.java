package week1.day2;

public class Numbers {
	int y =20;
	int startRange = 10;
	int endRange = 30;
	// print numbers from one range to another range 
	
	public void printNumbers(int startRange, int endRange) {
		System.out.println("-------------Print numbers from "+startRange+" to "+endRange+"-------------");
		for(int i=startRange; i<=endRange; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
	}
	
	// print oddNumber from one range to another range 
	public void printOddNumbers(int startRange, int endRange) {
		System.out.println("-------------Print odd numbers from "+startRange+" to "+endRange+"-------------");
		for(int i=startRange; i<=endRange; i++) {
			//write a logic/condition for odd number
			if(i%2==1) {
				System.out.print(i+" ");
		}
	}
		System.out.println();
	}
	// print Even numbers from one range to another range
	
	public void printEvenNumber(int startRange, int endRange) {
		System.out.println("-------------Print even numbers from "+startRange+" to "+endRange+"-------------");
		for(int i=startRange; i<=endRange; i++) {
			//write a logic/condition for odd number
			if(i%2==0) {
				System.out.print(i+" ");
		}
	}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int x = 10;// local variable
		Numbers a = new Numbers();
		a.printNumbers(50, 100);
		a.printNumbers(20, 30);
		a.printOddNumbers(40, 67);
		a.printEvenNumber(1, 30);
		a.num();
	}
	
	
	public void num() {
		int z = 20;
		int y = 40;
		System.out.println(z);
		System.out.println(y);
	}
	
}
