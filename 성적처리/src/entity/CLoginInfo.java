package entity;

import java.util.Scanner;

//Entity class or value class
public class CLoginInfo extends CEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static enum ELoginResult{ sucess, idError, passwordError, error};
	private ELoginResult eLoginResult;
	
	private String userID, password;//�Ӽ�  attributes

	
	public ELoginResult geteLoginResult() {	return eLoginResult;	}
	public void seteLoginResult(ELoginResult eLoginResult) {this.eLoginResult = eLoginResult;}
	public void setUserID(String userID) {this.userID = userID;}//���̤����� �о���ų�, �ش���ġ�� ���� ����.
	public void setPassword(String password) {this.password = password;}

	public String getUserID() {return userID;}
	public String getPassword() {return password;}
	@Override
	public void read(Scanner scanner) {
		// TODO Auto-generated method stub
		userID = scanner.next();
		password = scanner.next();
	};
	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
	
}
