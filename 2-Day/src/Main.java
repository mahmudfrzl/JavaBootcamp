
public class Main {

	public static void main(String[] args) {
		

		Product product1 = new Product(1,"Asus",9000,"IPS monitor"); // i created instance, reference
	

		Product product2 = new Product(2,"HP",6000,"16GB Ram");
		

		Product product3 = new Product();
		product3.id = 3;
		product3.name = "Macbook";
		product3.unitPrice = 20000;
		product3.detail = "1TB Ssd";

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.detail); // classes are reference type
		}

		System.out.println(products.length);
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
	}

}
