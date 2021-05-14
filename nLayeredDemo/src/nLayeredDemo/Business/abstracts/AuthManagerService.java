package nLayeredDemo.Business.abstracts;

public interface AuthManagerService {

	boolean isVerifyPassword(String password);
	boolean login(String firstName, String lastName);
}
