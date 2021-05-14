package nLayeredDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemo.Entities.concretes.User;
import nLayeredDemo.dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao{
	List<User> user = new ArrayList<User>();

	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanicinin kayit islemleri tamamlandi!");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanicinin hesabi sistemden silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanicinin hesabi guncellendi");
		
	}

	@Override
	public List<User> getAll(int id) {
		for(User users: user) {
			user.get(id);
		}
		System.out.println("------------");
		return this.user;
	}

}
