package awt;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame extends Frame {
	// 배경색이 될 배
	Color[] colors = { Color.GRAY, Color.blue, Color.green, Color.BLACK };

	String [] titles = {
			"2019", "019 2" ,"19 20" ,"9 201"
			
	};
	
	
	// 인덱스 변수
	int i = 0;

	public MyFrame() {
		// 옵션 설정
		this.setBackground(Color.GRAY);

		this.setTitle("2019");
		setSize(200, 200);
		setLocation(100, 100);
		setVisible(true);

		// 색상을 변경하는 스레드
		Thread th = new Thread() {
			public void run() {
				while (true) {
					i = i + 1;
					try {
						// 5초
						Thread.sleep(1000);
						//setBackground(colors[i % colors.length]);
						setTitle(titles[i % titles.length]);
						
					} catch (Exception e) {
						System.out.printf("%s\n", e.getMessage());
					}
				}
			}
		};
	th.start();
		
		
		
		
		/*
		 * try { //5초 Thread.sleep(5000); setBackground(Color.BLACK); }catch(Exception
		 * e) {}
		 */

	}

}
