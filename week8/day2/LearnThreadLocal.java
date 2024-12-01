package week8.day2;

public class LearnThreadLocal {
	private int x;
	private static final ThreadLocal<String> driverType = new ThreadLocal<String>();
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void setDriverType(String driverValue) {
		driverType.set(driverValue);
	}
	
	public String getDriverType() {
		return driverType.get();
	}
	
	
	
}
