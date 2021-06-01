package kodlamaio.hrms.business.abstracts;

public interface VerifyFieldService {

	boolean checkMail(String mail);
	boolean checkIdentityNumber(String id);
	boolean checkName(String name);
	boolean checkSurname(String surname);
	boolean checkPassword(String password);
	
}
