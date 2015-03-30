package 성적처리V02;

import DAO.DAO;
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
		DAO memberDAO = new DAO();
		memberDAO.write(member, "member");
		member = (CMember) memberDAO.read("member");
		// 과목개설
		
		CGwamokView gwamokview = new CGwamokView();
		CGwamok gwamok = gwamokview.getGwamok();
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		DAO gwamokDAO = new DAO();
		gwamokDAO.write(gwamok, "gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");
		//entity object 화면과 컨트롤이 필요 , 전체 멤버를 과리할 DAO가 존재
		
		// 강좌개설
		CGangjwaView gangjwaview = new CGangjwaView();
		CGangjwa gangjwa = gangjwaview.getGangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
		DAO gangjwaDAO = new DAO();
		gangjwaDAO.write(gangjwa, "gangjwa");
		gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");
	}

}
