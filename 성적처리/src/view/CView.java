package view;

import java.util.Scanner;
import java.util.Vector;

import control.CControl;

public class CView {
	private String menuText;//text를 보여주기 위해
	
	//association
	private CControl control;
	private Vector<CView> viewList;
	
	public String getMenuText(){return this.menuText;}
	public void add (CView view) {viewList.add(view);}//자식을 달기 위해
	public CControl getControl() {return control;}
	public void setControl(CControl control) {this.control = control;}
	
	public CView(String menuText){
		this.menuText = menuText;
		viewList = new Vector<CView>();
	}
	public void show(Scanner scaneer){
		int selection = 0;
		while(selection!=9){
			for(int i=0 ; i<viewList.size();i++){//자식을 루핑을 돌림
				System.out.println(i+": "+viewList.get(i).getMenuText());//메뉴타이틀만 프린트 아웃 어레이 인덱스
			}
			System.out.print("--Seletion Input: ");
			selection=scaneer.nextInt();
			viewList.get(selection).show(scaneer);
		}
	}
}
