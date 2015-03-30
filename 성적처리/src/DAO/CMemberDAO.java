package DAO;

import entity.CMember;


public class CMemberDAO {
	
	//Data Access Object : Read or write from persistent storage
	public CMember read(){return null;}
	public void write(CMember member) {
		// TODO Auto-generated method stub
		System.out.println("사용자아이디: "+member.getUserID());
		System.out.println("패스워드: "+member.getPassword());
	
	}

}
