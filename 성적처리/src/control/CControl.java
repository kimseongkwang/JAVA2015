package control;

import entity.CEntity;
import DAO.IDAO;

public class CControl {
	//association
	private IDAO dao;
	public IDAO getDao() {return dao;}
	public void setDao(IDAO dao) {this.dao = dao;}


}
