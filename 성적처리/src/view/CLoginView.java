package view;

import java.util.Scanner;

import control.CLoginControl;
import entity.CLoginInfo;

public class CLoginView extends CView {

	public void login() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//input from keybord using scanner
		CLoginInfo member = new CLoginInfo();
	//		String userId = scanner.next();
		member.setUserID("userId");
		
	//		String password = scanner.next();
		member.setPassword("password");
		
		//closs scanner
		member= (CLoginInfo) ((CLoginControl)this.getControl()).login(member);
		scanner.close();
	}
	
}
