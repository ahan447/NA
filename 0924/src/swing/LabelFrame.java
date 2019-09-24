package swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelFrame extends JFrame {
		JLabel lbl;
		ImageIcon [] images;
		public LabelFrame() {
			setLayout(new FlowLayout());
			images = new ImageIcon[4];
			images[0] = new ImageIcon("./0001.jpg");
			images[1] = new ImageIcon("./0002.jpg");
			images[2] = new ImageIcon("./0004.jpg");
			images[3] = new ImageIcon("./0003.jpg");
			
			
			//현재 디렉토리 경로를 확인
			String curDir = System.getProperty("user.dir");
			System.out.printf("%s\n" , curDir);
			
			/*
			//절대 경로를 이용해서 ImageIcon을 생성
			ImageIcon icon = 
					new ImageIcon("/Users/tjoeun304/Downloads/0001.jpg");
			*/
			//ImageIcon icon = 
			//		new ImageIcon("./001.jpg");
			
			//이미지 아이콘을 이용해서 레이블을 생성
			lbl = new JLabel(images[0]);
			add(lbl);
			
			
			Thread th = new Thread() {
				int idx = 0;
				public void run() {
					while(true) {
						try {
							idx = idx + 1;
							Thread.sleep(10000);
							lbl.setIcon(images[idx%images.length]);
						}
						catch(Exception e) {}
					}
				}
				
			};
			th.start();
			
			
			
			
			
			
			
			
			//닫기 버튼을 누를 때 종료기능을 수행하도록 설정
			setDefaultCloseOperation(
					JFrame.EXIT_ON_CLOSE);
			
			
			setBounds(100,100,1000,1000);
			setTitle("레이블 애니메이션");
			setVisible(true);
			
			
			
			
		}

}
