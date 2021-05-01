package Day_3;

public class StudentManager {
	public void add(Student student) {
		System.out.println("Ogrencinin ismi: " + student.getFirstName());
	}
	
	public void status(Student student) {
		System.out.println("Ogrencin'in kursdaki vazifesi: " + student.getCourseStatus());
	}
	
}
