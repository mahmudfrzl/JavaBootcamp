package RegistrationProcess.DataAccess.concretes;



import RegistrationProcess.DataAccess.abstracts.UserDao;
import RegistrationProcess.Entities.Concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName().toLowerCase() + " " + user.getLastName().toLowerCase()  + " sisteme kayit edildi");
		
	}

	@Override
	public void update(User user) {
	System.out.println(user.getFirstName().toLowerCase() + " " + user.getLastName().toLowerCase()  + " isimli kullanici sistemde guncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName().toLowerCase() + " " + user.getLastName().toLowerCase()  + " sistemden silindi");
		
	}




	
}
