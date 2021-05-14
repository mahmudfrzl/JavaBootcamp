package nLayeredDemo;

import nLayeredDemo.Business.abstracts.UserDaoService;
import nLayeredDemo.Business.concretes.AuthManager;
import nLayeredDemo.Business.concretes.EmailManager;
import nLayeredDemo.Business.concretes.UserDaoManager;
import nLayeredDemo.Entities.concretes.User;
import nLayeredDemo.core.concretes.GoogleCheckManager;
import nLayeredDemo.dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		UserDaoService daoService = new UserDaoManager(new EmailManager(),new GoogleCheckManager(), new HibernateUserDao(), new AuthManager());
		User user1 = new User(1,"Mahmud","Ferzeli","mahmud123@gmail.com","123124");//dogru
		User user2 = new User(1,"Yusuf","Yildiz","yusuf123@gmail....com","1231234");//email yanlis
		User user3 = new User(1,"Yusuf","Yildiz","yusuf123@gmail.com","123");//parola yanlis
		User user4 = new User(1,"E","Ferzeli","mahmud123@gmail.com","123124");//ad yanlis
		
		
		
		
		
	}

}
