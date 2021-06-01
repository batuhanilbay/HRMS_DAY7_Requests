package kodlamaio.hrms.core.adapter;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import kodlamaio.hrms.core.service.MailCheckService;

public class MailCheckAdapter implements MailCheckService {

	@Override
	public boolean mailCheck(String mail) {
		
		String character = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern  pattern = Pattern.compile(character);
		Matcher  matcher = pattern.matcher(mail);
		
		if(matcher.matches() == true) {
			return true;
		}
		
		return false;
		
	}
	
}
