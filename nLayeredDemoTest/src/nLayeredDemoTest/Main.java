package nLayeredDemoTest;

import nLayeredDemoTest.Core.JLoggerManagerAdapter;
import nLayeredDemoTest.JLogger.JLoggerManager;
import nLayeredDemoTest.business.abstracts.ProductService;
import nLayeredDemoTest.business.concretes.ProductManager;
import nLayeredDemoTest.dataAccess.concretes.AbcProductDao;
import nLayeredDemoTest.dataAccess.concretes.HIbernateProductDao;
import nLayeredDemoTest.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductManager(new JLoggerManagerAdapter(),new AbcProductDao());
		Product product = new Product(2,2,"Elma",12,50);
		String message ="Elma";
		
		productService.add(product);
		

	}

}
