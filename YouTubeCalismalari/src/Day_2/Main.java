package Day_2;

public class Main {

	public static void main(String[] args) {
	      Product product = new Product(1,"Hp 15","Laptop",5000,3);
	        product.setName("Laptop");
	        product.setDescription("Hp 15");
	        product.setId(1);
	        product.setPrice(5000);
	        product.setStockAmount(3);
	        ProductManager productManager = new ProductManager();
	        productManager.Add(product);
	        
	        System.out.println(product.getCode());

	}

}
