package view;

import java.util.Scanner;

import entity.CMember;

public class CLoginView extends CView {

	public void login() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//input from keybord using scanner
		CMember member = new CMember();
	//		String userId = scanner.next();
		member.setUserID("userId");
		
	//		String password = scanner.next();
		member.setPassword("password");
		
		//closs scanner
		scanner.close();
		member= (CMember) this.getControl().process(member);

	}
	
}
