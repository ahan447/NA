package eventhandling;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class EventFrame extends Frame {
	Button btn;
	//인스턴스 변수
	int x = 10;
							/*
							//내부 클래스를 이용한 이벤트 처리
							//인스턴스 변수 사용이 가능하고 상위 클래스의 메소드 사용이 가능
							class EventHandLer implements ActionListener {
						
								@Override
								public void actionPerformed(ActionEvent e) {
									setBackground(Color.GRAY);
									x= 30;
									
								}
								
								
							}
							*/	
	
	
	public EventFrame() {
		//지역변수
		int y = 20;
		//final 변수 - 상
		final int z = 30;
		//Frame의 기본 레이아웃이 BorderLayout이라서 변경
		setLayout(new FlowLayout());
		
		//버튼 생성
		btn = new Button("버튼");
		
		//외부에서 만든 ActionListener 인터페이스를 구현한 클래스
		//객체를 생성해서 이벤트를 처리
		//생성자를 이용해서 데이터 넘기기
		//this가 Frame으로 부터 상속을 받았기 때문에 Frame 객체
		//btn.addActionListener(new EventHandler(this));
		
		//setter를 이용해서 Frame 넘겨주기
		EventHandler eventHandler = new EventHandler();
		eventHandler.setFrame(this);
		btn.addActionListener(eventHandler);
		
		
		
		//내부에 만든 ActionListener 인터페이스를 구현한 클래스의
		//객체를 생성해서 이벤트를 처리
		
		
						//btn.addActionListener(new EventHandLer());
		
		
		
		
		//버튼을 클릭했을  처리를 위한 코드 구현
		//anonymous를 이용하는 방법
		//인스턴스 변스와 final은 사용이 가능하지만 이 코드가 구현된 메소드에서
		//생성된 지역변수는 사용을 못함.
		
		/*
		btn.addActionListener(new ActionListener() {
			
			//버튼을 누르거나 입력도구에서 Enter를 누를 때 호출되는 메소드 
			@Override
			public void actionPerformed(ActionEvent e) {
				//프레임의 배경색 변
				setBackground(Color.DARK_GRAY);
			
			//인스턴스 변수는 사용이 가능	
						x = 40;
			//지역변순느 사용할 수 없음
			//y = 50;	
			//final 변수 사용 가능
			System.out.printf("%d\n" , z);
			}
			
			
		});
		
		*/
		
		
		add(btn);
		
		setBounds(100,100,300,300);
		setTitle("이벤트 처리 연습");
		setVisible(true);
		
	}
	
	
}
