package control;

import entity.CEntity;
import entity.CLoginInfo;
import DAO.IDAO;

public class CControl {
	//association
	private IDAO dao;
	public IDAO getDao() {return dao;}
	public void setDao(IDAO dao) {this.dao = dao;}
	
	public CEntity process(CEntity entity) {
		// TODO Auto-generated method stub
		dao.read(entity, "member.txt");
		return entity;
	}

}
