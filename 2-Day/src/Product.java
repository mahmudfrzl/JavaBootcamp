
public class Product {


	public Product() { // constructor= bir class çalýþtýðýnda ilk çalýþan yerdir
		System.out.println("ben çalistim");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this();   // parametresiz olanina gider ve çalisirr
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;   // this= o classi temsil edir
		this.detail=detail;			// 
	}

	int id;
	String name;
	double unitPrice;
	String detail;

}
