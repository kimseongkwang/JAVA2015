package 성적처리V02;

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
		IDAO memberDAO = new ObjectDAO();
	//	memberDAO.write(member, "member");
	//	CMember member = new CMember();
		member = (CMember) memberDAO.read(member.getClass(), "member.txt");
	
		// 과목개설
		CGwamokView gwamokview = new CGwamokView();
		CGwamok gwamok = gwamokview.getGwamok();
		/*
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		IDAO gwamokDAO = new TextDAO();
	//	gwamokDAO.write(gwamok, "gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");
		//entity object 화면과 컨트롤이 필요 , 전체 멤버를 과리할 DAO가 존재
		
		// 강좌개설
		CGangjwaView gangjwaview = new CGangjwaView();
		CGangjwa gangjwa = gangjwaview.getGangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
		IDAO gangjwaDAO = new TextDAO();
	//	gangjwaDAO.write(gangjwa, "gangjwa");
		gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");
		*/
	}
 
}
