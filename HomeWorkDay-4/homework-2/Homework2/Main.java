package Homework2;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarBucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(5, "MAHMUD", "FERZELI", "2003", "78974"));
	}

}
