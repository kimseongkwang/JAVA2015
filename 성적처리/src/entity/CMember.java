package entity;

import java.io.Serializable;

import control.CLoginControl;

//Entity class or value class
public class CMember implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userID, password;//�Ӽ�  attributes
	private CLoginControl loginControl;
	//�Ӽ��� �ۺ����� ���� �ʴ´�.
	

	public void setUserID(String userID) {this.userID = userID;}//���̤����� �о���ų�, �ش���ġ�� ���� ����.
	public void setPassword(String password) {this.password = password;}

	public String getUserID() {return userID;}
	public String getPassword() {return password;}
	
}
