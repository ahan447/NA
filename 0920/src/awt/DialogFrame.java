package awt;

import java.awt.CheckboxMenuItem;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class DialogFrame extends Frame {
	
	public DialogFrame() {
		//현재 프레임을 부모로 갖는 대화상자를 생성
		//맨 뒤가 false이면 Modeless 대화상자
		//제어권이 다른곳으로 넘어감.
		Dialog d = new Dialog(this , "대화상자" , false);
		//Modal 은 화면에 출력되면 소멸되기 전까지
		//제어권을 넘기지 않음.
		//Modal 을 출력하면 화면에서 사라지기 전까지 아래 코드가
		//수행되지 않음
		//Dialog d = new Dialog(this , "대화상자" , true);
		d.setSize(100,200);		
		d.setVisible(true);
		
		MenuBar bar = new MenuBar();
		
		Menu file = new Menu("파일");
		
		MenuItem item1 = new MenuItem("열기");
		file.add(item1);
		
		
		CheckboxMenuItem item2 = new CheckboxMenuItem("저장");
		file.add(item2);
		
		bar.add(file);
		
		setMenuBar(bar);
		
		
		this.setBounds(100,100,300,300);
		this.setVisible(true);
		//d.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
