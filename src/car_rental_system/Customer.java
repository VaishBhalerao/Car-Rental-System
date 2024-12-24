package car_rental_system;

public class Customer {

	private String customerId;
	private String name;
	private long aadharNo,phone_no;
	
	Customer(String customerId,String name,long aadharNo,long phone_no){
		this.customerId=customerId;
		this.name=name;
		this.aadharNo=aadharNo;
		this.phone_no=phone_no;
	}
	public String getName() {
		return name;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public String getCustomerId() {
		return customerId;
	}
	public Long getPhoneNo() {
		return phone_no;
	}
}
