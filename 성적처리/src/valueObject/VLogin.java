package valueObject;

import java.util.Scanner;

//Entity class or value class
public class VLogin {
	private String userID, password;//속성  attributes

	public void setUserID(String userID) {this.userID = userID;}//데이ㅌㅏ를 읽어오거나, 해당위치의 값을 쓴다.
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
