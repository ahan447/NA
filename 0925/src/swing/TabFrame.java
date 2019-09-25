package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TabFrame extends JFrame {
		public TabFrame() {
			//탭 생성
			JTabbedPane tab = new JTabbedPane();
			
			JPanel panel1 = new JPanel();
			JButton btn = new JButton("고기고기고기");
			
			//btn을 클릭하면 메시지 박스를 출력
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
		//			JOptionPane.showMessageDialog(
		//					null,"이번주는벌초가야되잔","어림도없지",
		//					JOptionPane.ERROR_MESSAGE );
					
			//비교할 때 정수값을 비교한느 것보다는
			//Field로 비교하는 것이 좋음.
			//운영체제를 따라서 수정값을 변경할 수 있음.		
		//		int r = 				JOptionPane.showConfirmDialog(null, "삭제","정말로 삭제"
		//								,JOptionPane.YES_NO_OPTION);
		//		if (r == JOptionPane.YES_NO_OPTION) {
		//				System.out.printf("예를 선택\n");
		//			}else {
		//				System.out.printf("아니오 선택\n");
		//				}
					String input = JOptionPane.showInputDialog(null, "무슨 고기?");
				if(input == null) {
					System.out.print("고기 먹기 싫어?");
				}else {
					System.out.printf("%S 먹고싶다고?\n", 
							input.trim().toUpperCase());
				}
					
					
			}
				
			});
			panel1.add(btn);
			
			
			tab.add("이번주", panel1);
			//탭을 현재 화면에 추가
			add(tab);
			
			JPanel panel2 = new JPanel();
			JTextField tf = new JTextField(50);
			
			panel2.add(tf);
			JButton btn2 = new JButton("고기고기고기");
			panel2.add(btn2);
			
			
			tab.add("다음주", panel2);
			//탭을 현재 화면에 추가
			add(tab);
			
			JPanel panel3 = new JPanel();
			//버튼 1개와 TextArea를 배치해서 버튼을 누르면
			//파일대화상자를 출력하고 선택한 파일이름들을
			//TextArea에 출력하기
			
			JButton btnFile = new JButton("파일 가져오기");
			panel3.add(btnFile);
			
			
			//anonymous class에서 사용가능하도록 하기 위해서
			//final을 붙임
			//anonymous class 에서는 자신을 포함한 메소드의
			//지역변수를 사용할 수 없음
			JTextArea ta = new JTextArea(20,30);
			panel3.add(ta);
			
			btnFile.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JFileChooser fc = 
							new JFileChooser();
					//여러 개 선택 가능하도록 하기
					fc.setMultiSelectionEnabled(true);
					//파일 대화상자 출력
					int r = fc.showOpenDialog(null);
					//확인을 눌렀을 때
					if(r == JFileChooser.APPROVE_OPTION) {
						//선택한 파일 목록 가져오기
						File [] files = fc.getSelectedFiles();
						
						//String disp = "";
						
						
						//문자열을 heap에 저장해서
						//문자열에 직접 연산을 하는 클래스의 객체 생성
						//String은 정적 영역에 문자열을 저장하고
						//작업을 할 때는 복사해서 수행하는 클래스
						StringBuilder sb = new StringBuilder();
						for(File file : files) {
							//파일 이름 : file. getName();
							//ta.setText(file. getName()); - 다중이 안됨
						//disp = String.format("%s%s\n", disp, file.getName());
						sb.append(file.getName());
						sb.append("\n");
							
						}
						//ta.setText(disp);
						ta.setText(sb.toString());
					}else {
						ta.setText("선택한 파일이 없습니다.\n");
					}
					
				}
			});
			
			
			
			tab.add("파일 대화상자", panel3);
			
			JMenuBar menuBar = new JMenuBar();
			
			JMenu menu = new JMenu("첫 메뉴");
			
			JMenuItem item1 = new JMenuItem("대화상자 출력");
			item1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "메뉴 클릭");
					
				}
			});
			
			//alt + m 그리고 d를 누르면 메뉴가 실행
			//윈도우즈에서 실행
			menu.setMnemonic('m');
			item1.setMnemonic('d');
			
			menu.add(item1);
			
			menuBar.add(menu);
			
			setJMenuBar(menuBar);
			
			
			setBounds(100,100,500,500);
			setTitle("탭 만들기");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
