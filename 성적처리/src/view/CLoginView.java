package view;

import java.io.IOException;
import java.util.Scanner;

import valueObject.VLogin;
import valueObject.VUser;
import control.CLoginControl;

public class CLoginView extends CView {

	public CLoginView() {
		super("로그인 화면");
		// TODO Auto-generated constructor stub
	}
	public void show(Scanner scanner){
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		
		//input from keybord using scanner
		VLogin vLogin = new VLogin();
	//		String userId = scanner.next();
	//		String password = scanner.next();
		vLogin.setUserID("id5");
		vLogin.setPassword("pw5");
		
	//	VUser vUser = (VUser)((CLoginControl)this.getControl()).login(vLogin);
		System.out.println("login result: "+vLogin.getUserID());
	
	}
}
