package main;

import DAO.IDAO;
import DAO.TextDAO;
import view.CLoginView;
import view.CSugangView;
import control.CLoginControl;
import control.CSugangControl;
import entity.VUser;
import view.CExceptionView;

public class CMain {
	
	public static void main(String[] args) {
		try {
			//components
			CLoginView 	loginView = new CLoginView();	
			CLoginControl loginControl = new CLoginControl();
			IDAO dao = new TextDAO();
			//associates
			loginView.setControl(loginControl);
			loginControl.setDao(dao);
			//start program
			VUser vUser = loginView.login();

			//compotnents
			CSugangView sugangView = new CSugangView();
			CSugangControl sugangControl = new CSugangControl();
			//associates
			sugangView.setControl(sugangControl);
			sugangControl.setDao(dao);
			//start
			sugangView.sugangSincheong(vUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CExceptionView.processException(e);
		}
	}
}
