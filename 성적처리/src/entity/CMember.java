package entity;

//Entity class or value class
public class CMember extends CEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userID, password;//�Ӽ�  attributes
	//�Ӽ��� �ۺ����� ���� �ʴ´�.
	

	public void setUserID(String userID) {this.userID = userID;}//���̤����� �о���ų�, �ش���ġ�� ���� ����.
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
