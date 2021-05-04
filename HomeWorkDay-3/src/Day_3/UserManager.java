package Day_3;

public class UserManager {
	public void addMail(User user) {
		System.out.println("Userin emaili : " + user.getEmail() );
	}
	public void addSifre(User user) {
		System.out.println("Userin parola : " + user.getPassword() );
	}
}
