
public class Main {

	public static void main(String[] args) {

        Category programming1 = new Category("C#+Angular","Engin Demirog",1);

        Category programming2 = new Category("Java+React","Engin Demirog",2);

        Category programming3 = new Category("Proglamaya Giris Icin Temel Kurs","Engin Demirog",3);
        Category[] categories ={programming1,programming2,programming3};
        for(Category category:categories){
            System.out.println(category.courseName);
        }
        ProductManager productManager = new ProductManager();
        productManager.addToCourse(programming2);
        
        Instructor instructor = new Instructor("Engin Demiroglu",37,"(MCT) ,PMP ve ITIL ");
        System.out.println(instructor.name + instructor.certifcates+instructor.age);

	}

}
