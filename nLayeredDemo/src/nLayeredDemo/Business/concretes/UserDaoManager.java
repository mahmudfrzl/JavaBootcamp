package nLayeredDemo.Business.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemo.Business.abstracts.AuthManagerService;
import nLayeredDemo.Business.abstracts.EmailService;
import nLayeredDemo.Business.abstracts.UserDaoService;
import nLayeredDemo.Entities.concretes.User;
import nLayeredDemo.core.abstracts.GoogleCheckService;
import nLayeredDemo.dataAccess.abstracts.UserDao;

public class UserDaoManager implements UserDaoService{
	private EmailService emailService;
	private GoogleCheckService googleCheckService;
	private UserDao userDao;
	private AuthManagerService authManagerService;
	

	public UserDaoManager(EmailService emailService, GoogleCheckService googleCheckService, UserDao userDao,AuthManagerService authManagerService) {
		super();
		this.emailService = emailService;
		this.googleCheckService = googleCheckService;
		this.userDao = userDao;
		this.authManagerService= authManagerService;
	}


	@Override
	public void login(User user) {

		
	}


	@Override
	public void register(User user) {
		
		
	}
	
	
	



}
