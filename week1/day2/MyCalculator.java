package week1.day2;

public class MyCalculator {

	
	public static void main(String[] args) {
		//To access calculator method, create object for Calculator class
		Calculator cal = new Calculator();
		float add = cal.add(5, 2.5f);
		System.out.println(add);
		int sub = cal.sub(7, 50);
		System.out.println(sub);
		float multiple = cal.multiple(2.3f, 5.7f);
		System.out.println(multiple);
		float div = cal.div(21, 7);
		System.out.println(div);
	}
	
}
