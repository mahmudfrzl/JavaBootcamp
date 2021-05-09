package RegistrationProcess.Business.concretes;


import RegistrationProcess.Business.abstracts.UserService;



public class UserManager implements UserService {
	
	private AuthManager authManager;
	private EmailManager emailManager;
	public UserManager(AuthManager authManager, EmailManager emailManager) {
		super();
		this.authManager = authManager;
		this.emailManager = emailManager;
	}

	
	
	
}
