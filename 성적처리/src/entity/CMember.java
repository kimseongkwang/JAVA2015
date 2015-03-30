package entity;

import control.CLoginControl;

//Entity class or value class
public class CMember {
	private String userID, password;//속성  attributes
	private CLoginControl loginControl;
	//속성을 퍼블릭으로 놓지 않는다.
	

	public void setUserID(String userID) {this.userID = userID;}//데이ㅌㅏ를 읽어오거나, 해당위치의 값을 쓴다.
	public void setPassword(String password) {this.password = password;}

	public String getUserID() {return userID;}
	public String getPassword() {return password;}
	
}
