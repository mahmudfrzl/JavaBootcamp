package Day_3;

public class User {
	String firstName;
	String lastName;
	String email;
	String password;
	int age;
	public User() {
		
	}
	
	public User(String firstName,String lastName,String email,String password,int age) {
		this.age=age;
		this.email=email;
		this.firstName=firstName;
		this.lastName=lastName;
		this.password=password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
		
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	
}
