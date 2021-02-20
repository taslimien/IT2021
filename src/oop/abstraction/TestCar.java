package oop.abstraction;

public class TestCar {

	public static void main(String[] args) {
		
		System.out.println("       HIGHLANDER");
		
		Car highlander = new Toyota();
		highlander.start();
		highlander.stop();
		Toyota highlander1 = new Toyota();
		highlander1.carBody();
		Car.wheel();
		
		System.out.println("B======R======E======A======K");
		
		System.out.println("       Mercedes");
		
		Car series5 = new Mercedes();
		series5.start();
		series5.stop();
		Mercedes series7 = new Mercedes();
		series7.saftyFeature();
		Car.wheel();
		
		System.out.println("B=======R======E=======A======K");
		
		System.out.println("       Flying Car");
		
		Vehicle vehicle = new AeroMobile();
		vehicle.drive();
		vehicle.fly();
		
		MotorCar motorCar = new AeroMobile();
		motorCar.flyingFeature();
		
		AeroMobile aeroMobile = new AeroMobile();
		aeroMobile.electricEngine();
		Car.wheel();
		
		
	}

}
