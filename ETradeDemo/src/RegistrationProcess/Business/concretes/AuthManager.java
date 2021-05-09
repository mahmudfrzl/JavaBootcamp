package RegistrationProcess.Business.concretes;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import RegistrationProcess.Business.abstracts.AuthService;
import RegistrationProcess.Entities.Concretes.User;

public class AuthManager implements AuthService {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}

	ArrayList<User> users = new ArrayList<>();

	public AuthManager(ArrayList<User> users) {
		super();
		this.users = users;
	}

	@Override
	public boolean ifChechkPassword(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Sifre en az 6 basamakli olmali,lutfen yeniden islemlere baslayin!");
			return false;
		}
		return true;

	}

	@Override
	public boolean checkEmail(User user) {
		for (User u : users) {
			if (u.getEmail() == user.getEmail()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean loginCheck(String email, String password) {
		for (User user : users) {
			if (user.getEmail() == email && user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}



	@Override
	public boolean isPasswordAndEmailEmpty(User user) {
		if (user.getEmail() == null && user.getPassword() == null) {
			System.out.println("Kullanici adi ve ya parola eksik!");
			return false;
		}
		return true;
	}

	@Override
	public boolean ifNameCheck(User user) {
		if(user.getFirstName().length()<2 && user.getLastName().length()<2) {
			System.out.println("Kullanici ismi ve soy ismi en az 2 karakterden olusmali!");
			return false;
		}
		return true;
	}

}
