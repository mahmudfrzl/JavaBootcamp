package RegistrationProcess.Business.concretes;

import RegistrationProcess.Business.abstracts.EmailService;
import RegistrationProcess.Entities.Concretes.User;

public class EmailManager implements EmailService{

	@Override
	public boolean isValidation(String email) {
		System.out.println("Tum islemler tamamlandi, basariyla sisteme kayd olundunuz!");
		return true;
	}

	@Override
	public boolean isVerify(String email) {
		System.out.println("Dogrulama tamamlandi,emailinize link gonderildi");
		return true;
	}
	
}
