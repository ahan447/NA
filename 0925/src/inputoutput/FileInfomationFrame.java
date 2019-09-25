package inputoutput;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FileInfomationFrame extends JFrame {

	JButton btnInfo;
	JButton btnCreateFile;
	JTextArea display;
	
	public FileInfomationFrame() {
		JPanel panel = new JPanel();
		btnInfo= new JButton("파일 정보 확인");
		
		
		
		display = new JTextArea(30,40);
		add(display);
		btnInfo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//파일 대화상자 만들고 출력하기
			
				JFileChooser fc = new JFileChooser();
				int r = fc.showOpenDialog(null);
				//확인을 선택했다면
				StringBuilder sb = new StringBuilder();
				if(r == JFileChooser.APPROVE_OPTION){
				
					File f = fc.getSelectedFile();
					sb.append("마지막 수정날짜 : "+ f.lastModified() +"\n");
					//에폭시타임을 date로 변경
					Date d = new Date(f.lastModified());
					sb.append("마지막 수정날짜 : " + d.toString() + "\n");
					
					
					//파일 크기 출력하기
					sb.append("파일 크기 : " + f.length()+ "\n");
					long size = f.length() / 1024;
					sb.append("파일 크기 : " + size + "K\n");
					
					
					//오늘 날짜를 이용해서 파일 이름 만들기
					//오늘날짜.log 로 만들기
					//현재 시간을 만들기
					GregorianCalendar cal = new GregorianCalendar();
					//Date로 만들기
					Date today = new Date(cal.getTimeInMillis());
					sb.append("오늘날짜이름 : " + today.toString() + ".log\n");
					
					
					//파일 이름 바꾸기
					//변경할 파일 경로 생성
					
					String name = f.getName();
					
					//앞에 3글자 제거
					String modName = name.substring(3);
					//현재 디렉토리
					
					File fff = new File("./" + modName);
					//파일의 디렉토리
					//File fff = new File("./" + modName);
					f.renameTo(fff);
					
					
					
					
					
					
					File updateFile =
							new File("./update.dat");
					f.renameTo(updateFile);
					
					
					
					
					
					
					//파일 존재 여부 확인
					File ff = new File("./0003.jpg");
					if(ff.exists() == false) {
						sb.append("파일이 존재하지 않음\n");
					}else{
						sb.append("파일이 존재함\n");
					}
					
					
					
					
					
					
					display.setText(sb.toString());
				}else {
				display.setText("선택한 파일이 없음");	
				}
			}
		});
		
	
		btnCreateFile = new JButton("파일 생성");
		btnCreateFile.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
			GregorianCalendar cal = 
					new GregorianCalendar();
			Date today = new Date(cal.getTimeInMillis());
			
			Path path = Paths.get("./" + today.toString() + ".log");
			
			//파일을 생성
		try {
			//예외가 발생하지 않아야 하고 현재 작업 디렉토리에 파일이 생성
			Files.createFile(path);
		}catch(Exception e1) {
			//예외 메시지가 null 이라고 나오면 NullPointerException 발생
			System.out.printf("예외 : %s\n" , e1.getMessage());
			
		}
			
			
			}
		});
		
		panel.add(btnCreateFile);
		
		
		panel.add(btnInfo);
		add("North" , panel);
		
		
		setBounds(100,100,500,500);
		pack();
		setTitle("파일 정보 출력하기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
