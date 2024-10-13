package week1.day2;

public class Car {
//class level variable or global variable
	String color = "green";
	String model = "coopers";
	String brand = "mini";
	int noOfMirrors = 2;
	int noOfWheels = 5;
	String numberPlate = "TN 13 AB 1234";
	char logo = 'm';
	
//	drive
//	start
//	stop
//	reverse
//	playMusic
//	changeGear
//	increaseSpeed
//	decreaseSpeed
	
	//method signature
		// accessModifier/access specifier returnType methodName(inputArgs){}
	
	public void drive() {
		System.out.println("Drive the car");
	}
	//shortcut to create method stub --> type methodName and do ctrl + spacebar and enter
	public void start() {
		System.out.println("Start the car");
	}
	public void stop() {
		System.out.println("Stop the car");
	}
	
	public void increaseSpeed() {
		System.out.println("Increase the speed of the car");
	}
	
	public void decreaseSpeed() {
		System.out.println("decrease the speed of the car");
	}
	
	public void playMusic() {
		System.out.println("Play the music");
	}
	
	public void reverse() {
		System.out.println("Reverse the car");
	}
	
	public void changeGear() {
		System.out.println("Change the gear");
	}
	
	public static void main(String[] args) {
		//Create object for the car
//		syntax to create object classname objectName(objectReference) = new className();
		
		Car gokul = new Car();
		//call the member of the class with the help of object reference 
		gokul.playMusic();
		gokul.start();
		gokul.drive();
		gokul.increaseSpeed();
		gokul.increaseSpeed();
		gokul.decreaseSpeed();
		gokul.stop();
		gokul.reverse();
		System.out.println(gokul.color);
		gokul.color = "Black";
		System.out.println("Car color for gokul "+gokul.color);
		
		Car vinoth = new Car();
		System.out.println("Car color for vinoth "+vinoth.color);
	}
	
}
