package eventhandling;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EventWindow extends Frame {

	
	Button btn;
	public EventWindow() {
		this.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				btn.setLocation(e.getX(), e.getY());
				
			}
		});
		//현재 프레임의 키보드 이벤트(KeyListener)를 처리
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				btn.setBackground(Color.GREEN);
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				btn.setBackground(Color.RED);
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				btn.setBackground(Color.YELLOW);
				
			}
		});
		
		setLayout(new FlowLayout());
		btn = new Button("버튼");
		add(btn);
		
		//AWT 나 Swing은 이벤트 처리를 Delegate 패턴을 처리
		//Delegate 패턴 : 이벤트가 발생한 객체가 이벤틀르 처리하지 않고
		//별도의 객체를 만들어서 처리하도록 하는 패턴 - 위임
		btn.addMouseListener(new MouseListener() {
			
			@Override
			//마우스 클릭
			public void mouseReleased(MouseEvent e) {
				btn.setForeground(Color.YELLOW);
				System.out.printf("X:%d, Y:%d\n", e.getX(), e.getY());
				
			}
			
			@Override
			//마우스 오른쪽 클릭
			public void mousePressed(MouseEvent e) {
				btn.setForeground(Color.cyan);
				
			}
			
			@Override
			//올라왔던 마우스 커서가 내려가면
			public void mouseExited(MouseEvent e) {
				btn.setForeground(Color.gray);
				
			}
			
			@Override
			//마우스가 올라가면
			public void mouseEntered(MouseEvent e) {
				btn.setForeground(Color.blue);
				
			}
			
			@Override
			//마우스 가운데 클릭
			public void mouseClicked(MouseEvent e) {
				btn.setForeground(Color.ORANGE);
				
			
		};
			
			
		});
		
		
		setBounds(100,100,300,300);
		setTitle("이벤트 처리");
		setVisible(true);
		
	}
}
	
	
	
	
	
	
