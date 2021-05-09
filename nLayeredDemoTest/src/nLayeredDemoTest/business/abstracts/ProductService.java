package nLayeredDemoTest.business.abstracts;

import java.util.List;

import nLayeredDemoTest.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	
	List<Product> getAll();
}
