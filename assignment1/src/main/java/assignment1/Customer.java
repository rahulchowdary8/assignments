package assignment1;

public class Customer {
//	 customerId, customerName, 	 customerContact, customerAddress
private int customerId;
private long customerContact;
private String customerName;
private Address customerAddress;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public long getCustomerContact() {
	return customerContact;
}
public void setCustomerContact(long customerContact) {
	this.customerContact = customerContact;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public Address getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(Address customerAddress) {
	this.customerAddress = customerAddress;
}

void show() {
	System.out.println("customerId:-"+customerId+" customerContact:-"+customerContact+" customerName:- "+customerName);
	System.out.println(customerAddress);
}


}
