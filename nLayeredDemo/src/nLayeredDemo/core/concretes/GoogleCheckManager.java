package nLayeredDemo.core.concretes;

import nLayeredDemo.GoogleValidation.GoogleValidation;
import nLayeredDemo.core.abstracts.GoogleCheckService;

public class GoogleCheckManager implements GoogleCheckService{

	@Override
	public boolean isGoogleValid(String message) {
		GoogleValidation googleValidation = new GoogleValidation();
		googleValidation.googleValid(message);
		return false;
	}

}
