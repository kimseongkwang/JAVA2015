package entity;

//Entity class or value class
public class CMember extends CEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userID, password;//속성  attributes
	//속성을 퍼블릭으로 놓지 않는다.
	

	public void setUserID(String userID) {this.userID = userID;}//데이ㅌㅏ를 읽어오거나, 해당위치의 값을 쓴다.
	public void setPassword(String password) {this.password = password;}

	public String getUserID() {return userID;}
	public String getPassword() {return password;}
	@Override
	void read() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void write() {
		// TODO Auto-generated method stub
		
	}
	
}
