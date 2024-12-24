package car_rental_system;

public class Car {

	private String carId,brand,model ;
	private double basePricePerDay;
	private boolean isAvailable;
	public Car(String cardId, String brand, String model, double basePricePerDay, boolean isAvailable) {
		this.carId = cardId;
		this.brand = brand;
		this.model = model;
		this.basePricePerDay = basePricePerDay;
		this.isAvailable = isAvailable;
	}
	
	public String getCarID() {
		return carId;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public double getPrice(int rental_days) {
		return basePricePerDay*rental_days;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void rent() {
		isAvailable=false;
	}
	public void returnCar() {
		isAvailable=true;
	}
}
