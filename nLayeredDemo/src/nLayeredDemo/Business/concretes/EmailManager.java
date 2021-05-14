package nLayeredDemo.Business.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemo.Business.abstracts.EmailService;
import nLayeredDemo.Entities.concretes.User;

public class EmailManager implements EmailService{
	List<User> users = new ArrayList<User>();

	@Override
	public boolean isVerifyEmail(String email) {
		for(User user: users) {
			if(user.getEmail()==email) {
				return false;
			}
			
		}return true;
		
	}

	@Override
	public void sendEmail(String email) {
		System.out.println("Uyeliginiz basariyla sonuclandi!");
		
	}


}
