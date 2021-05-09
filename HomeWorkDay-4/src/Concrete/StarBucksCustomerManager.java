package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;


public class StarBucksCustomerManager extends BaseCustomerManager{
		
	 CustomerCheckService checkService;
	
	public StarBucksCustomerManager(CustomerCheckService checkService) {
		this.checkService=checkService;
	}
	
	public void save(Customer customer) {
		if(checkService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}


}
