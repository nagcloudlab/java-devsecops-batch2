package com.example.main;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


public class CustomerManager {

	private List<Customer> customerTasks = new ArrayList<Customer>(); 
	private int nextAvalailbleId = 0;
	
	public  void addCustomer(Customer customer) {
		synchronized (this) {
			customer.setId(nextAvalailbleId);
			synchronized(customerTasks) {
				customerTasks.add(customer);
			}
			nextAvalailbleId++;
		}

	}

	public Optional<Customer> getNextCustomer() {
		synchronized(customerTasks) {
				if (customerTasks.size() > 0) {
					return Optional.of(customerTasks.remove(0));
				}
		}
		return Optional.empty();
	}	

	public void howManyCustomers() {
		int size = 0;
		size = customerTasks.size();
		System.out.println("" + new Date() + " Customers in queue : " + size + " of " + nextAvalailbleId);
	}

}
