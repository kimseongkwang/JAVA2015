package control;

import java.io.FileNotFoundException;

import entity.CLoginInfo;
import entity.CLoginInfo.ELoginResult;

public class CLoginControl extends CControl {
	
	
	public CLoginInfo login(CLoginInfo loginInfo) {
		// TODO Auto-generated method stub
		try {
			CLoginInfo loginInfoDAO;
			this.getDao().connect("member.txt");
			while(..){
				CLoginInfo loginInfoDAO = (CLoginInfo)this.getDao().read();
				if (loginInfoDAO.getUserID()==loginInfo.getUserID()){
					if(loginInfoDAO.getPassword() == loginInfo.getPassword())
						loginInfo.seteLoginResult(ELoginResult.sucess);
				}
				this.getDao().disconnect();
			catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return loginInfo;
		
}
	
