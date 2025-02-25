package car_rental_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRentalSystem {

	private List<Car> cars;
	private List<Customer> customers;
	private List<Rental> rentals;
	
	public CarRentalSystem() {
		cars=new ArrayList<>();
		customers=new ArrayList<>();
		rentals=new ArrayList<>();
		
	}
	public void addCar(Car car) {
		cars.add(car);
	}
	public void addCustomer(Customer customer) {
		customers.add(customer);
	
	}
	public void rentCar(Car car,Customer customer,int days ) {
		if(car.isAvailable()) {
			car.rent();
			rentals.add(new Rental(car,customer,days));
		}
		else {
			System.out.println("Car is not available for rent");
		}
	}
	public void returnCar(Car car) {
		car.returnCar();
		Rental  rentalToRemove=null;
		for(Rental rental:rentals) {
			if(rental.getCar()==car) {
				rentalToRemove=rental;
				break;
			}
		}
		if(rentalToRemove!=null) {
			rentals.remove(rentalToRemove);
		}
		else {
			System.out.println("Car was not rented");
		}
	}
	public void menu() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println(" ****** Car Rental System ****** ");
			System.out.println("1. Rent a Car");
			System.out.println("2. Return a Car");
			System.out.println("3. Exit");
			System.out.print("Enter Your Choice -> ");
			
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("Rent a Car ");
				System.out.println("Enter your name : ");
				String customerName=sc.nextLine();
				System.out.println("\nAvailable Cars :");
				for(Car car :cars) {
					if(car.isAvailable()) {
						System.out.println(car.getCarID()+"  "+car.getBrand()+" "+car.getModel()+" ");
					}
				}
				System.out.println("\nEnter Car ID you want to rent : ");
				String carId=sc.nextLine();
				
				System.out.println("Enter the number of days for rental : ");
				int rentalDays=sc.nextInt();
				sc.nextLine();//newline
				
				Customer newCustomer=new Customer("CUS"+(customers.size()+1),customerName);
				addCustomer(newCustomer);
			}
		}
	}
}
