package RegistrationProcess.Business.abstracts;

import RegistrationProcess.Entities.Concretes.User;

public interface AuthService {
	
	boolean ifChechkPassword(String password);
	boolean isValidEmail(String email);
boolean loginCheck(String email, String password);
boolean ifNameCheck(String firstName,String lastName);
boolean isPasswordAndEmailEmpty(String email,String password);

}
