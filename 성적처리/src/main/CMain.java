package main;

import java.io.FileNotFoundException;

import DAO.IDAO;
import DAO.TextDAO;
import view.CExceptionView;
import view.CLoginView;
import control.CLoginControl;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CMain {
	
	public static void main(String[] args) {
		try {//login
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CExceptionView.processException(e);
		}
	}
}
