package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CLoginView extends CView {

	public VUser login()
			throws UserIDNotFoundException,
			PasswordNotMatchException, IOException{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//input from keybord using scanner
		VLogin vLogin = new VLogin();
	//		String userId = scanner.next();
	//		String password = scanner.next();
		vLogin.setUserID("id5");
		vLogin.setPassword("pw5");
		
		VUser vUser = (VUser) 
				((CLoginControl)this.getControl()).login(vLogin);
		System.out.println("login result: "+vUser.getName());
		
		return vUser;
	}
	
}
