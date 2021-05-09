package RegistrationProcess.Business.abstracts;

import RegistrationProcess.Entities.Concretes.User;

public interface EmailService {
	boolean isValidation(String email);
	boolean isVerify(String email);
}
