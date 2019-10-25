package graphic;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {

		setTitle("그래픽 출력");
		setBounds(0, 0, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		System.out.printf("생성자\n");
	}

	// 화면에 출력될 때 호출되는 메소드
	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.gray);
		g.drawString("불금은뭐다?", 100, 95);
		g.setColor(Color.RED);
		g.drawRect(100, 100, 100, 50);
		System.out.printf("화면 출력\n");
	}
}
