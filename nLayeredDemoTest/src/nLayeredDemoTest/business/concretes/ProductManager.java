package nLayeredDemoTest.business.concretes;

import java.util.List;


import nLayeredDemoTest.business.abstracts.ProductService;
import nLayeredDemoTest.dataAccess.abstracts.ProductDao;
import nLayeredDemoTest.entities.concretes.Product;

public class ProductManager implements ProductService{
	private ProductDao productDao;

	


	
	 public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}



	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride urun kabul edilmiyor");
			return;
		}
		this.productDao.add(product);
		
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}




}
