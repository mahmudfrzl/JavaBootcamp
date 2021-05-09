package RegistrationProcess;

import java.util.ArrayList;

import RegistrationProcess.Business.abstracts.UserService;
import RegistrationProcess.Business.concretes.AuthManager;
import RegistrationProcess.Business.concretes.EmailManager;
import RegistrationProcess.Business.concretes.UserManager;
import RegistrationProcess.Core.abstracts.GoogleCheckService;
import RegistrationProcess.DataAccess.abstracts.UserDao;
import RegistrationProcess.DataAccess.concretes.HibernateUserDao;
import RegistrationProcess.Entities.Concretes.User;

public class Main {

	public static void main(String[] args) {
		ArrayList<User> user = new ArrayList<User>();
		
		
		UserService service = new UserManager(new EmailManager(), new HibernateUserDao(), new AuthManager(user));
		User user2 = new User(1, "Mahmud", "Ferzeli", "mahmudfrzli@gmail.com","12345");//sifre yanlis
		User user3 = new User(2, "Engin", "Demirog", "engindemirog@gmail.com","123");//isim yanlis
		User user4 = new User(1, "Yusuf", "Efe", "postayanlis@121","12345");//e-mail yanlis
		User user5 = new User(1, "Mahmud", "Ferzeli", "mahmudfrzli@gmail.com","123453456");
		
		service.login("engindemirog@gmail.com", "123");
		service.register(user5);
		service.login("mahmudfrzli@gmail.com", "123561");
		service.loginWithGoogle(null);
		
		
		
		
		
			

	}

}
