package RegistrationProcess.Business.concretes;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import RegistrationProcess.Business.abstracts.AuthService;
import RegistrationProcess.Entities.Concretes.User;

public class AuthManager implements AuthService {


	ArrayList<User> users = new ArrayList<>();

	public AuthManager(ArrayList<User> users) {
		super();
		this.users = users;
	}

	@Override
	public boolean ifChechkPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Sifre en az 6 basamakli olmali,lutfen yeniden islemlere baslayin!");
			return false;
		}
		return true;

	}



	@Override
	public boolean loginCheck(String email, String password) {
		for (User user : users) {
			if (user.getEmail() == email || user.getPassword() == password) {
				return false;
			}
		}
		return true;
	}



	@Override
	public boolean isPasswordAndEmailEmpty(String email,String password) {
		if (email == null && password == null) {
			System.out.println("Kullanici adi ve ya parola eksik!");
			return false;
		}
		return true;
	}

	@Override
	public boolean ifNameCheck(String firstName,String lastName) {
		if(firstName.length()<2 && lastName.length()<2) {
			System.out.println("Kullanici ismi ve soy ismi en az 2 karakterden olusmali!");
			return false;
		}
		return true;
		
		
	}

	@Override
	public boolean isValidEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}
}
