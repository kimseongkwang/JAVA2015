package entity;

import java.io.Serializable;
import java.util.Scanner;

public class CUser extends CEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userID, name;
	private String password;

	public void setUserID(String userID) {this.userID = userID;}
	public void setName(String name) {this.name = name;}
	public String getUserID() {return userID;}
	public String getName() {return name;}
	
	public void setPassword(String password) {this.password = password;}
	public String getPassword() {return password;}
	public void read(Scanner scanner) {
		userID = scanner.next();
		password = scanner.next();
		name = scanner.next();
	};
	public void write(Scanner scanner) {}

}
