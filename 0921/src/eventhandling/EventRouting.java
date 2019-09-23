package eventhandling;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
	Button Bluebtn, greenbtn, 검은색btn;
	
	public EventRouting() {
		setLayout(new FlowLayout());
		
		Bluebtn = new Button("파랑");
		greenbtn = new Button("녹색");
		검은색btn = new Button("검정");
		
		
		add(Bluebtn);
		add(greenbtn);
		add(검은색btn);
		
		//버튼
		ActionListener listener = new ActionListener() {
			@Override
			//이벤트가 발생한 객체 - e.getSource()
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == Bluebtn) {
					setBackground(Color.blue);
				}else if(e.getSource() == greenbtn){
					setBackground(Color.green);
				
				}else if(e.getSource() == 검은색btn){
					setBackground(Color.black);
				
				}
			}
		};
		
		//3개 버튼의 액션 이벤트 처리를 동일한 객체에게 위임 - 이벤트 라우팅
		
		Bluebtn.addActionListener(listener);
		greenbtn.addActionListener(listener);
		검은색btn.addActionListener(listener);
		
		
								/*
								Bluebtn.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										setBackground(Color.blue);
										
									}
								});
								greenbtn.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										setBackground(Color.green);
										
									}
								});
								
								검은색btn.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										setBackground(Color.black);
										
									}
								});
								
								
								*/
		
		
		setBounds(100,100,300,300);
		setTitle("이벤트 라우팅");
		setVisible(true);
		
	}
	
	
}
