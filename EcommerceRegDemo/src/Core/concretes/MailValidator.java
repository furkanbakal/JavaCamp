package Core.concretes;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import Core.abstracts.ValidatorService;
import Entities.concretes.User;

public class MailValidator implements ValidatorService{
	
	String mailPattern="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	Pattern pattern=Pattern.compile(mailPattern, Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean checkUser(User user) {
		Matcher matcher=pattern.matcher(user.getEmail());
		if(matcher.matches()==true) {
			System.out.println("Mail pattern baþarýlý..");
			return true;
		}
		System.out.println("Geçersiz mail adresi...");
		return false;
		
	}
}
