package eventhandling;

import java.awt.Frame;
import java.awt.Label;



public class KeyFrame extends Frame {
	
	
		Label lbl;
		public KeyFrame() {
		setLayout(null);
		
		//레이블을 생성해서 배치
		lbl = new Label("@");
		lbl.setBounds(10,30,20,20);
		add(lbl);
		
		//Frame에 윈도우 이벤트가 발생하면
		//EventHandlar 객체에게 처리해다랄고 요청
		EventHandler eventHandler =
				new EventHandler(lbl);
		this.addWindowListener(eventHandler);
		this.addKeyListener(eventHandler);
		
		
		setBounds(100,100,300,300);
		setTitle("키보드와 윈도우 이벤트 처리");
		setVisible(true);
	}
}
