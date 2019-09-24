package eventhandling;

import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//인터페이스는 여러개 구현이 가능
public class EventHandler extends WindowAdapter
	implements KeyListener {
	
	//KeyFrame의 Label에 대한 참조를 저장할 변수
	Label lbl;

	//레이블을 주입받기 위한 생성자
	public EventHandler(Label lbl) {
		this.lbl = lbl;
	}
	
	
	

	@Override
	public void windowClosing(WindowEvent e) {
	//프로그램 종료
		System.exit(0);

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// 종료가 될 때

	}



	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		//lbl의 좌표 가져오기
		int x = lbl.getX();
		int y = lbl.getY();
		//방향키를 누르면
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			x = x - 5;
		}else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			x = x + 5;
		}else if (e.getKeyCode() == KeyEvent.VK_UP) {
			y = y - 5;
		}else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			y = y + 5;
		
	}
		System.out.printf("조합키 : %d\n" , e.getModifiers());
		System.out.printf("누른 문자 : %c\n" , e.getKeyChar());
		System.out.printf("누른 키보드 코드 : %d\n" , e.getKeyCode());
		lbl.setLocation(x,y);
		if(e.getModifiers() == 2 && e.getKeyCode() == 88) {
			System.exit(0);
		}
	

}
}