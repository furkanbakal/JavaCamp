package Core.concretes;

import java.util.Scanner;

import Core.abstracts.UserVerifyService;

public class UserVerifyCode implements UserVerifyService{

	
	
	@Override
	public boolean userVerify() {
		int realCode = (int) (Math.random() * 100000);
		System.out.println("Doðrulama kodunuz: "+realCode);
		
		Scanner input=new Scanner(System.in);	
		System.out.println("Doðrulama kodunu giriniz..");
		int inputCode=input.nextInt();
		
		if(realCode==inputCode) {
			return true;
		}
		
		return false;
	}

}
