package view;

import java.util.Scanner;

import entity.CMember;

public class CLoginView {

	public CMember login() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//input from keybord using scanner
		CMember member = new CMember();
		System.out.printf("����� ���̵� �Է� �ϼ���: ");
//		String userId = scanner.next();
		member.setUserID("userId");
		
		System.out.printf("��й�ȣ�� �Է� �ϼ���: ");
//		String password = scanner.next();
		member.setPassword("password");
		
		//closs scanner
		scanner.close();
		return member;
	}
	
}
