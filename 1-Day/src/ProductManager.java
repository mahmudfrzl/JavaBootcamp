
public class ProductManager {

    public void addToCart(Product product) {
        System.out.println("Sepete eklendi: " + product.getName());
    }
    public void chooseCategory(Category category){
        System.out.println("Secdigin kategori: " +category.getName());
    }
}
