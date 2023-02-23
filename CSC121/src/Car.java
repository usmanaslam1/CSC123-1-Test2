//1 - Package name goes here
//2 - Imports

//3 - Class declaration
public class Car {
// Properties, characteristics, Fields
	private  String brand;
	private String color;
	private int numberOfWheels;
	private String gear;
	private boolean started;
	private Engine engine;
	
	
	//Methods, Operations, Features

	public Car(String brand, String color,Engine engine, int wheels) {
		this.brand=brand;
		this.color=color;
		this.engine=engine;
		this.numberOfWheels=wheels;
	}

	public Car(Car car) {
		this.brand=car.getBrand();
		this.color=car.getColor();
		this.engine=engine;
		this.numberOfWheels=car.getNumberOfWheels();
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}


	public String getBrand() {
		return this.brand;
	}	
	
	
	public String getColor() {
		return color;
	}



	public Engine getEngine() {
		return engine;
	}



	public int getNumberOfWheels() {
		return numberOfWheels;
	}



	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		if(gear.equalsIgnoreCase("P"))
		this.started = started;
	}

	public String toString() {
		return brand+":"+color+":"+engine.toString()+":"+numberOfWheels;
	}
	
	public boolean equals(Object o) {
		Car other=(Car)o;
	
		return other.color.equalsIgnoreCase(this.color)&&
				other.brand.equalsIgnoreCase(this.brand)&&
				other.numberOfWheels==this.numberOfWheels;
				//other.cylinders==this.cylinders;
		
	}
}
