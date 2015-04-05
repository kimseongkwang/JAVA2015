package ����ó��V02;

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
		memberDAO.write(member, "member");
		member = (CMember) memberDAO.read("member");
		
		// ���񰳼�
		CGwamokView gwamokview = new CGwamokView();
		CGwamok gwamok = gwamokview.getGwamok();
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		IDAO gwamokDAO = new TextDAO();
		gwamokDAO.write(gwamok, "gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");
		//entity object ȭ��� ��Ʈ���� �ʿ� , ��ü ����� ������ DAO�� ����
		
		// ���°���
		CGangjwaView gangjwaview = new CGangjwaView();
		CGangjwa gangjwa = gangjwaview.getGangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
		IDAO gangjwaDAO = new TextDAO();
		gangjwaDAO.write(gangjwa, "gangjwa");
		gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");
		
	}

}
