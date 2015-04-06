package control;

import entity.CMember;

public class CLoginControl extends CControl {
	private CMember member;
	
	public CMember login(CMember member) {
		// TODO Auto-generated method stub
		
		this.member = member;//포인터인데 점
		return this.member;
	}

}
