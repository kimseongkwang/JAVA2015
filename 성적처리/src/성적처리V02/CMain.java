package ����ó��V02;

import DAO.DAO;
import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import view.CSugangView;
import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import control.CSugangControl;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CMember;
import entity.CSugang;

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
		// ���񰳼�
		
		CGwamokView gwamokview = new CGwamokView();
		CGwamok gwamok = gwamokview.getGwamok();
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		DAO gwamokDAO = new DAO();
		gwamokDAO.write(gwamok, "gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");
		//entity object ȭ��� ��Ʈ���� �ʿ� , ��ü ����� ������ DAO�� ����
		
		// ���°���
		CGangjwaView gangjwaview = new CGangjwaView();
		CGangjwa gangjwa = gangjwaview.getGangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
		DAO gangjwaDAO = new DAO();
		gangjwaDAO.write(gangjwa, "gangjwa");
		gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");
		
		//������û
		CSugangView sugangview = new CSugangView();
		CSugang sugang = sugangview.shinchung();
		CSugangControl sugangControl = new CSugangControl();
		sugang = sugangControl.shinchung(sugang);
		DAO sugangDAO = new DAO();
		sugangDAO.write(sugang, "sugang");
		sugang = (CSugang) sugangDAO.read("sugang");
	}

}
