package Entitles;



public class Gamer {
	String TcNo;
	String firstName;
	String lastName;
	int DateBirthDay;
	public Gamer(String tcNo, String firstName, String lastName, int dateBirthDay) {
		
		TcNo = tcNo;
		this.firstName = firstName;
		this.lastName = lastName;
		DateBirthDay = dateBirthDay;
	}
	public String getTcNo() {
		return TcNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getDateBirthDay() {
		return DateBirthDay;
	}
	public void setTcNo(String tcNo) {
		TcNo = tcNo;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDateBirthDay(int dateBirthDay) {
		DateBirthDay = dateBirthDay;
	}


	
}
