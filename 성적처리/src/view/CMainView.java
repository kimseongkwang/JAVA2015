package view;

import java.io.IOException;
import java.util.Scanner;

import valueObject.VLogin;
import valueObject.VUser;
import control.CLoginControl;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CMainView extends CView {
	private VUser vUser;
	private CHaksaengView haksaengView;
	Scanner scanner = new Scanner(System.in);

	public CMainView(){
		super("main view");
		scanner = new Scanner(System.in);
	}

	public void show() {
		// TODO Auto-generated method stub
		try {
			CLoginView loginView = new CLoginView();
			loginView.show(scanner); //if 학생인지 교수인지 뭔지 판단
			
			haksaengView = new CHaksaengView(vUser);
			haksaengView.show(scanner);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
