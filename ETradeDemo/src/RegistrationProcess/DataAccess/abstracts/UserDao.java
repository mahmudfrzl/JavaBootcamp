package RegistrationProcess.DataAccess.abstracts;



import RegistrationProcess.Entities.Concretes.User;

public interface UserDao {
void add(User user);
void update(User user);
void delete(User user);
}
