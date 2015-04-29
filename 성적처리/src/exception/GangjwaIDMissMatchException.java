package exception;

import java.io.IOException;

public class GangjwaIDMissMatchException extends IOException {
	public GangjwaIDMissMatchException(){
		super("GangjwaID Not Match Exception");
	}
}
