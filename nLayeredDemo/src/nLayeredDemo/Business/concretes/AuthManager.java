package nLayeredDemo.Business.concretes;

import nLayeredDemo.Business.abstracts.AuthManagerService;

public class AuthManager implements AuthManagerService{
	@Override
	public boolean isVerifyPassword(String password) {
		if(password.length()<6) {
			System.out.println("Parola en az 6 karakterden olusmali");
			return false;
		}
		System.out.println("Parola dogru girilmis");
		return true;
		
	}

	@Override
	public boolean login(String firstName, String lastName) {
		if((firstName.length()<2)&& (lastName.length()<2)) {
			System.out.println("Ad ve soyad islemini yeniden yapiniz!");
			return false;
		}
		return true;
	}
}
