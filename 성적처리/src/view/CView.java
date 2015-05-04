package view;

import java.util.Scanner;
import java.util.Vector;

import control.CControl;

public class CView {
	private String menuText;//text�� �����ֱ� ����
	
	//association
	private CControl control;
	private Vector<CView> viewList;
	
	public String getMenuText(){return this.menuText;}
	public void add (CView view) {viewList.add(view);}//�ڽ��� �ޱ� ����
	public CControl getControl() {return control;}
	public void setControl(CControl control) {this.control = control;}
	
	public CView(String menuText){
		this.menuText = menuText;
		viewList = new Vector<CView>();
	}
	public void show(Scanner scaneer){
		int selection = 0;
		while(selection!=9){
			for(int i=0 ; i<viewList.size();i++){//�ڽ��� ������ ����
				System.out.println(i+": "+viewList.get(i).getMenuText());//�޴�Ÿ��Ʋ�� ����Ʈ �ƿ� ��� �ε���
			}
			System.out.print("--Seletion Input: ");
			selection=scaneer.nextInt();
			viewList.get(selection).show(scaneer);
		}
	}
}
