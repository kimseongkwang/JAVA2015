package control;

import java.io.FileNotFoundException;
import java.util.Vector;

import DAO.IDAO;
import entity.CEntity;
import entity.CGangjwa;
import entity.CUser;

public class CSugangControl extends CControl{

	public Vector<CGangjwa> getGangjwaList() throws FileNotFoundException {
		// TODO Auto-generated method stub
		//real entity list
		this.getDao().connect("gnagjwa.txt");
		Vector<CEntity> entityList = this.getDao().readAll();
		this.getDao().disconnect();
		
		//type cast
		Vector<CGangjwa> gangjwaList = new Vector<CGangjwa>();
		for(CEntity entity: entityList){
			gangjwaList.add((CGangjwa)entity);
		}
		
		return gangjwaList;
	}

}
