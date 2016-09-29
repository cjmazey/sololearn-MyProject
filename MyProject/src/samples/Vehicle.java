package samples;

public class Vehicle {
	private String color;
	
	public Vehicle() {
		this.setColor("Red");
	}
	
	public Vehicle(String c) {
		this.setColor(c);
	}
	
	public void setColor(String c) {
		this.color = c;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public static void horn() {
		System.out.println("Beep");
	}
}
