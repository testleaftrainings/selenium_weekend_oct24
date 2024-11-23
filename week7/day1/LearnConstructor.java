package week7.day1;

public class LearnConstructor {
	
	LearnConstructor(int x){
		System.out.println("This is parameterized constructor and the x value is "+x);
	}
	
	
	public LearnConstructor() {
		this(0);
		System.out.println("This is default or no argument constructor");
		
	}


	public static void main(String[] args) {
		LearnConstructor lc = new LearnConstructor();
	}
	
}
