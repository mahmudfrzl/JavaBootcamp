package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.Entities.concretes.User;

public interface UserDao {
	void register(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll(int id);
	
	
}
