package main;

import DAO.IDAO;
import DAO.TextDAO;
import view.CLoginView;
import control.CLoginControl;

public class CMain {
	
	public static void main(String[] args) {
	
		//login
		//create object
		//view
		CLoginView 	loginView = new CLoginView();	
		//control
		CLoginControl loginControl = new CLoginControl();
		//dao
		IDAO dao = new TextDAO();
		//associates
		loginView.setControl(loginControl);
		loginControl.setDao(dao);
		
		//start program
		loginView.login();
	}
}
