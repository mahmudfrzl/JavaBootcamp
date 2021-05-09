package RegistrationProcess.Business.abstracts;

import RegistrationProcess.Entities.Concretes.User;

public interface EmailService {
	boolean isValidation(User user);
	boolean isVerify(User user);
}
