
public class Engine {
	private int cylinders;
	private int displacement;
	private int horsePower;
	private String make;
	
	public Engine(int cylinders, int displacement, int horsePower, String make) {
		this.cylinders = cylinders;
		this.displacement = displacement;
		this.horsePower = horsePower;
		this.make = make;
	}
	public int getCylinders() {
		return cylinders;
	}

	public int getDisplacement() {
		return displacement;
	}

	public int getHorsePower() {
		return horsePower;
	}
	public String getMake() {
		return make;
	}

	public String toString() {
		return "Engine [cylinders=" + cylinders + ", displacement=" + displacement + ", horsePower=" + horsePower
				+ ", make=" + make + "]";
	}
	
	
	

}
