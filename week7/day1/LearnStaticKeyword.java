package week7.day1;

public class LearnStaticKeyword {

	LearnStaticKeyword(){
		System.err.println("This is constructor");
	}
	
	static int x = 7;  // static variable or class level variable 
	int a = 127; // non-static variable
	
	
	public void m1() { // non-static method
		System.out.println("This is method m1 and non static method");
		System.out.println(a);
		System.out.println(x);
		m2();
	}
	
	public static void m2() {// static method
		System.out.println("This is method m2 and static method");
		System.out.println(x);
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Entry of main method");
		m2();
		System.out.println(x);
		LearnStaticKeyword obj1 = new LearnStaticKeyword();
		System.out.println(++obj1.a);
		LearnStaticKeyword obj2 = new LearnStaticKeyword();
		LearnStaticKeyword obj3 = new LearnStaticKeyword();
		LearnStaticKeyword obj4 = new LearnStaticKeyword();
		
		System.out.println(++obj2.a);
		System.out.println(++obj3.a);
		System.out.println(++obj4.a);
		System.out.println(++obj1.x);
		System.out.println(++obj2.x);
		
	}
	
	
	{
		System.out.println("This is non- static block -1 ");
	}
	
	
	static {
		System.out.println("This is static block");
	}
	
	{
		System.out.println("This is non- static block -2");
	}
	
	
}
