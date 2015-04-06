package 己利贸府V02;

import DAO.IDAO;
import DAO.ObjectDAO;
import DAO.TextDAO;
import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CMember;

public class CMain {
	
	public static void main(String[] args) {
	
		//login
		CLoginView 	loginView = new CLoginView();	
		CMember member = loginView.login();
		CLoginControl loginControl = new CLoginControl();
		member = loginControl.login(member);
		IDAO memberDAO = new TextDAO();
	//	memberDAO.write(member, "member");
	//	CMember member = new CMember();
		member = (CMember) memberDAO.read(member, "member.txt");
	
		
	}
 
}
