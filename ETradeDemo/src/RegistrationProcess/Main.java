package RegistrationProcess;

import java.util.ArrayList;

import RegistrationProcess.Business.abstracts.UserService;
import RegistrationProcess.Business.concretes.AuthManager;
import RegistrationProcess.Business.concretes.EmailManager;
import RegistrationProcess.Business.concretes.UserManager;
import RegistrationProcess.Entities.Concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(2, "sxdvf", "asegfsdg", "sdg", null);
		User user2 = new User(3, "sxdsfgdvf", "asegfsdg", "sdg", "xfcbv");
		
		ArrayList<User> user = new ArrayList<User>();
		user.add(user2);
		user.add (user1);
		UserService service = new UserManager(new AuthManager(user), new EmailManager());
		System.out.println(user1.getFirstName());
		
		

	}

}
