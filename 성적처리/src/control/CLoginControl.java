package control;

import java.io.FileNotFoundException;

import entity.CUser;
import entity.VLogin;
import entity.VUser;
import entity.VUser.ELoginResult;

public class CLoginControl extends CControl {
	public VUser login(VLogin vLogin) {
		// TODO Auto-generated method stub
		VUser vUser = new VUser();
		CUser user = new CUser();
		try {
			this.getDao().connect("member.txt");
			user = (CUser)this.getDao().read(user, vLogin.getUserID());
			this.getDao().disconnect();
			
			if( user == null){
				vUser.seteLoginResult(ELoginResult.idError);
				return vUser;
			}
			if(!user.getPassword().equals(vLogin.getPassword())){
				vUser.seteLoginResult(ELoginResult.passwordError);
				return vUser;
			}
			vUser.seteLoginResult(ELoginResult.sucess);
			vUser.setName(user.getName());
			vUser.setUserID(user.getID());
			return vUser;
			
			/*while(this.getDao().hasNext()){
				user = (CUser)this.getDao().read(user);
				if (user.getID().equals(vLogin.getUserID())){
					if(user.getPassword().equals(vLogin.getPassword())){
						vUser.seteLoginResult(ELoginResult.sucess);
						vUser.setName(user.getName());
						vUser.setUserID(user.getID());
				}else{
					vUser.seteLoginResult(ELoginResult.passwordError);
					}
					this.getDao().disconnect();
					return vUser;
				}
			}
			
			this.getDao().disconnect();
			vUser.seteLoginResult(ELoginResult.idError);
			return vUser;*/
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			vUser.seteLoginResult(ELoginResult.fileNotFound);
			return vUser;
		}
	}
}	
