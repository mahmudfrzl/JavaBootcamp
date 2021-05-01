package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer mahmud = new IndividualCustomer();
		mahmud.customerNumber="1234";
		
		
		
		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber="7867857";
		
		SendicaCustomer abc = new SendicaCustomer();
		abc.customerNumber="9999";
		
		
		CustomerManager customerManager = new CustomerManager();
//		customerManager.add(hepsiburada);
//		customerManager.add(mahmud);
//		customerManager.add(abc);
		
		Customer[] customers = {mahmud,abc,hepsiburada};
		
		customerManager.addMultiple(customers);
		
	}

}
