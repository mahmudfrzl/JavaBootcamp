package RegistrationProcess.Core.concretes;

import RegistrationProcess.Core.abstracts.GoogleCheckService;
import RegistrationProcess.GoogleValidation.GoogleValidation;

public class GoogleCheckManager implements GoogleCheckService{

	@Override
	public boolean isGoogleValid(String message) {
		GoogleValidation googleValidation = new GoogleValidation();
		googleValidation.googleValid(message);
		return true;
	}



}
