package nLayeredDemo.Business.abstracts;

public interface EmailService {
	boolean isVerifyEmail(String email);
	void sendEmail(String email);
}
