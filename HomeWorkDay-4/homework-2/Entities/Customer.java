package Entities;

import Abstract.CustomerService;

public class Customer implements CustomerService {
	
	public  int id;
	public String firstName;
	public String lastName;
	public String dateofBirthDay;
	public String nationalityId;
	

	public Customer(int id, String firstName, String lastName, String dateofBirthDay, String nationalityId) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirthDay = dateofBirthDay;
		this.nationalityId = nationalityId;
	}


	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}


	public int getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getDateofBirthDay() {
		return dateofBirthDay;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setDateofBirthDay(String dateofBirthDay) {
		this.dateofBirthDay = dateofBirthDay;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}





}
