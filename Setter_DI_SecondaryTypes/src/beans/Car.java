package beans;

public class Car {

	private String carName;
	 private Engine engine;
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	 
	public void printDate() {
		System.out.println("Car Name : "+carName );
		System.out.println("Car Model : "+engine.getModel());
	}
	 
}
