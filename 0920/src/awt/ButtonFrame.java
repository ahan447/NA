package awt;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.List;

public class ButtonFrame extends Frame {
	//화면에 보여지는 객체 중에서 값을 가져오거나 설정해야 하는
	//컴포넌트가 있으면 인스턴스 변수로 생성
	
	//체크박스 2개,라디오 버튼 2개, 일반 버튼 1개
	Checkbox cbBaseball, cbSoccer;
	Checkbox radioMan, radioWoman;
	Button btn;
	//초이스에 보여질 데이터 리스트
	List<String> item;
	Choice choice;
	
	public ButtonFrame() {
		cbBaseball = new Checkbox("야구");
		cbSoccer = new Checkbox("축구");
		
		CheckboxGroup gender = 
				new CheckboxGroup();
		radioMan = new Checkbox("남자" , gender, true);
		radioWoman = new Checkbox("여자" , gender, true);
		
		btn = new Button("확인");
		
		//패널을 생성해서 컴포넌트들을 패널에 부착
		Panel p = new Panel();
		p.add(cbBaseball);
		p.add(cbSoccer);
		p.add(radioMan);
		p.add(radioWoman);
		p.add(btn);
		
		item = new ArrayList<String>();
		item.add("프로그래밍 언어");
		item.add("데이터베이스");
		item.add("네트워크 보안");
		item.add("4");
		
		choice = new Choice();
		//Choice에 리스트의 데이터를 추가
		for(String temp : item) {
			choice.add(temp);
		}
		
		p.add(choice);
		
		
		//패널을 프레임에 부착
		add(p);
		
		//옵션을 설정
		setSize(300,300);
		setLocation(200,200);
		setVisible(true);
		 
		
		
		
		
	} 
}
