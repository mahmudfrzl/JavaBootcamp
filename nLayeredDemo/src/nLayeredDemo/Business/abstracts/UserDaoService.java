package nLayeredDemo.Business.abstracts;

import nLayeredDemo.Entities.concretes.User;

public interface UserDaoService {
	void login(User user);
	void register(User user);
}

