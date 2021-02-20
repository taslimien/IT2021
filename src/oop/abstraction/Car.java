package oop.abstraction;

public interface Car {

	public void start();
	
	public void stop();
	
	public static void wheel() {
		System.out.println("Car must have wheels");
	}
}
