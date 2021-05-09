package RegistrationProcess.Business.abstracts;

import RegistrationProcess.Entities.Concretes.User;

public interface AuthService {

	boolean ifChechkPassword(User user);
	boolean checkEmail(User user);
	boolean loginCheck(String email, String password);
	boolean ifNameCheck(User user);
	boolean isPasswordAndEmailEmpty(User user);
}
