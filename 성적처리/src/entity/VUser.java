package entity;

public class VUser {

	public static enum ELoginResult{ sucess, idError, passwordError, fileNotFound};
	private ELoginResult eLoginResult;
	private String userID, name;

	public void setUserID(String userID) {this.userID = userID;}
	public void setName(String name) {this.name = name;}
	public String getUserID() {return userID;}
	public String getName() {return name;}
	
	
	public ELoginResult geteLoginResult() {	return eLoginResult;}
	public void seteLoginResult(ELoginResult eLoginResult) {this.eLoginResult = eLoginResult;}
}
