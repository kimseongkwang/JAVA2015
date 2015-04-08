package main;

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
import entity.CLoginInfo;

public class CMain {
	
	public static void main(String[] args) {
	
		//login
		//create object
		CLoginView 	loginView = new CLoginView();	
		CLoginControl loginControl = new CLoginControl();
		IDAO dao = new TextDAO();
		//associates
		loginView.setControl(loginControl);
		loginControl.setDao(dao);
		//start login
		loginView.login();
	}
 
}
