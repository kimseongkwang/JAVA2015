package exception;

import java.io.IOException;

public class PasswordNotMatchException extends IOException {
		public PasswordNotMatchException(){
		super("Password Not Match Exception");
	}
}
