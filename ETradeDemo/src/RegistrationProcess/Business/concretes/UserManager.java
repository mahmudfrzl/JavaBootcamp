package RegistrationProcess.Business.concretes;

import RegistrationProcess.Business.abstracts.AuthService;
import RegistrationProcess.Business.abstracts.EmailService;
import RegistrationProcess.Business.abstracts.UserService;
import RegistrationProcess.Core.abstracts.GoogleCheckService;
import RegistrationProcess.DataAccess.abstracts.UserDao;
import RegistrationProcess.DataAccess.concretes.HibernateUserDao;
import RegistrationProcess.Entities.Concretes.User;
import RegistrationProcess.GoogleValidation.GoogleValidation;

public class UserManager implements UserService {
	private UserDao dao;

	private EmailService emailService;
	private AuthService authService;
	private GoogleCheckService googleCheckService;

	public UserManager(EmailService emailService, UserDao dao, AuthService authService,GoogleCheckService googleCheckService) {
		super();
		this.googleCheckService=googleCheckService;
		this.dao = dao;
		this.emailService = emailService;
		this.authService = authService;

	}

	@Override
	public void register(User user) {
		if (authService.ifChechkPassword(user.getPassword())
				|| (authService.isPasswordAndEmailEmpty(user.getEmail(), user.getPassword())
						|| (authService.ifNameCheck(user.getFirstName(), user.getLastName()))
						
				|| (authService.isValidEmail(user.getEmail()))))

		{
			System.out.println("Kullanici bilgileri hatali girilmistir");
		} else {
			dao.add(user);

		}

	}

	@Override
	public void login(String email,String password) {
		if(!authService.loginCheck(email,password)) {
			System.out.println("Basariyla giris yaptiniz");
		}else {
			System.out.println("Kullanici adi ve ya sifresi hatali");
		}
	}

	@Override
	public void loginWithGoogle(String message) {
		googleCheckService.isGoogleValid(message);

	}

}
