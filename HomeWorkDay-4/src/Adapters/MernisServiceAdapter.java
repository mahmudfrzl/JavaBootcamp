package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), 2003);
		} catch (Exception e) {
			System.out.println("Dogrulama basarisiz");
		}
		return false;
	}
		
}
