package RegistrationProcess.Business.abstracts;

import RegistrationProcess.Entities.Concretes.User;

public interface UserService {
	void register(User user);
	void login(String email,String password);
	void loginWithGoogle(String message);
	
}
