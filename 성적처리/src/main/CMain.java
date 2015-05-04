package main;

import DAO.IDAO;
import DAO.TextDAO;
import valueObject.VUser;
import view.CMainView;
import view.CSugangView;
import control.CGangjwaControl;
import control.CLoginControl;
import view.CExceptionView;

public class CMain {
	
	public static void main(String[] args) {
		try {
			/*
			IDAO dao = new TextDAO();
			//components
			CMainView mainView = new CMainView();	
			CLoginControl loginControl = new CLoginControl();
	
			//associates
			mainView.setControl(loginControl);
			loginControl.setDao(dao);
			
			//components
			CSugangView sugangView = new CSugangView();
			CGangjwaControl sugangControl = new CGangjwaControl();
			//associates
			sugangView.setControl(sugangControl);
			sugangControl.setDao(dao);
	
			//start program
			*/
			CMainView mainView = new CMainView();	
			mainView.show();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			CExceptionView.processException(e);
		}
	}
}
