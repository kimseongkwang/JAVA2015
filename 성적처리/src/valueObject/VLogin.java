package valueObject;

import java.util.Scanner;

//Entity class or value class
public class VLogin {
	private String userID, password;//�Ӽ�  attributes

	public void setUserID(String userID) {this.userID = userID;}//���̤����� �о���ų�, �ش���ġ�� ���� ����.
	public void setPassword(String password) {this.password = password;}

	public String getUserID() {return userID;}
	public String getPassword() {return password;}
	public void read(Scanner scanner) {
		userID = scanner.next();
		password = scanner.next();
	};
	public void write(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
	
}
