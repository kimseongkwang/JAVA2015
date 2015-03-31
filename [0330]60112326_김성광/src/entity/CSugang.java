package entity;

import java.io.Serializable;
import java.util.Vector;

public class CSugang implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int gangjwaID;
	private String gangjwaname;
	private Vector<String> gangjwatime;
	
	
	public int getGangjwaID() {return gangjwaID;}
	public void setGangjwaID(int gangjwaID) {this.gangjwaID = gangjwaID;}
	public String getGangjwaname() {return gangjwaname;}
	public void setGangjwaname(String gangjwaname) {this.gangjwaname = gangjwaname;}
	public Vector<String> getGangjwatime() {return gangjwatime;}
	public void setGangjwatime(Vector<String> gangjwatime) {this.gangjwatime = gangjwatime;}	
}
