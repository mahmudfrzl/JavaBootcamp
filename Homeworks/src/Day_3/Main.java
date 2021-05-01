package Day_3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setAge(17);
		student.setFirstName("Mahmud");
		student.setLastName("Ferzeli");
		student.setPassword("mahmud123");
		student.setEmail("mahmud@mail.ru");
		student.setCourseStatus("Odevleri yapmak");
		
		Instructor instructor = new Instructor();
		instructor.setAge(34);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setPassword("engin1235");
		instructor.setEmail("engingDemir@gmail.com");
		instructor.setSertifcate(" (MCT) ,PMP ve ITIL ");
		
		StudentManager manager = new StudentManager();
		manager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		

	}

}
