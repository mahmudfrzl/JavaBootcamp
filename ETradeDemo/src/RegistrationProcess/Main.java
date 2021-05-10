package RegistrationProcess;

import java.util.ArrayList;

import RegistrationProcess.Business.abstracts.UserService;
import RegistrationProcess.Business.concretes.AuthManager;
import RegistrationProcess.Business.concretes.EmailManager;
import RegistrationProcess.Business.concretes.UserManager;
import RegistrationProcess.Core.abstracts.GoogleCheckService;
import RegistrationProcess.Core.concretes.GoogleCheckManager;
import RegistrationProcess.DataAccess.abstracts.UserDao;
import RegistrationProcess.DataAccess.concretes.HibernateUserDao;
import RegistrationProcess.Entities.Concretes.User;

public class Main {

	public static void main(String[] args) {
		ArrayList<User> user = new ArrayList<User>();
		
		
		UserService service = new UserManager(new EmailManager(), new HibernateUserDao(), new AuthManager(user),new GoogleCheckManager());
		User user2 = new User(1, "Mahmud", "Ferzeli", "mahmudfrzli@gmail.com","12345");//sifre yanlis
		User user3 = new User(2, "E", "Demirog", "engindemirog@gmail.com","128763");//isim yanlis
		User user4 = new User(1, "Yusuf", "Efe", "postayanlis@121","12345");//e-mail yanlis
		User user5 = new User(1, "Mahmud", "Ferzeli", "mahmudfrzli@gmail.com","12387987");
		service.login(user2.getEmail(), user2.getPassword());
		service.register(user5);
		service.login(user5.getEmail(), user5.getPassword());
		
		String message = "";
		service.loginWithGoogle(message);
		
		
		
		
		
			

	}

}
