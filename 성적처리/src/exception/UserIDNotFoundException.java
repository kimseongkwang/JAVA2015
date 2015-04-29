package exception;

import java.io.IOException;

public class UserIDNotFoundException extends IOException {
	public UserIDNotFoundException(){
		super("User ID Not Found Exception");
	}

}
