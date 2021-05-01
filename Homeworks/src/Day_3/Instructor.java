package Day_3;

public class Instructor extends User {
	String sertifcate;
	
	public Instructor() {
		
	}
	
	public Instructor(String sertifcate) {
		this.sertifcate=sertifcate;
	}

	public String getSertifcate() {
		return sertifcate;
	}

	public void setSertifcate(String sertifcate) {
		this.sertifcate = sertifcate;
	}
	
	
	
}
