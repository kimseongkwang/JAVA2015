package DAO;

import entity.CMember;


public class CMemberDAO {
	
	//Data Access Object : Read or write from persistent storage
	public CMember read(){return null;}
	public void write(CMember member) {
		// TODO Auto-generated method stub
		System.out.println("����ھ��̵�: "+member.getUserID());
		System.out.println("�н�����: "+member.getPassword());
	
	}

}
