package graphic;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class G2DPanel extends JPanel{
//화면에 보여질 때 나 repaint 메소드를 호출하면
	//화면에 출력되는 메소드
	@Override//상위 클래스에 있는 메소드를 재정의 한다는 어노테이션
	//상위 클래스에 메소드가 존재하지 않으면 컴파일 에러 발
	public void paint(Graphics g) {
		/*			 
		//그림 그리기
		 g.fillRect(100, 100, 50, 50);
		 //그래픽스 객체 변환
		 Graphics2D g2 = (Graphics2D)g;
		 
		 
		/* //색상 설정
		 g2.setColor(Color.CYAN);
		 g2.fill(new Rectangle2D.Double(200,200,70,85));
		 
		 g2.setColor(Color.yellow);
		 g2.draw(new Ellipse2D.Double(200,200,30,30));
		 *
		 
		 //그라데이션 설정
		 g2.setPaint(new GradientPaint(5,3,Color.RED, 10,50,Color.YELLOW,true));
		 g2.fill(new Rectangle2D.Double(200,200,70,85));
		 //선두께 수정
		 g2.setStroke(new BasicStroke(10));
		 g2.draw(new Ellipse2D.Double(200,300,100,100));
		 //색상 변경
		 g2.setPaint(Color.ORANGE);
		 float [] dashes = {5};
		  g2.setStroke(new BasicStroke(
				  5, BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND,10,dashes,0));
		 g2.draw(new Ellipse2D.Double(100,300,100,100));
		 
		 
		*/
		//Image 이미지 객체 만들기
		Image image = 
				Toolkit.getDefaultToolkit()
				.getImage("/Users/tjoeun304/git/NA/0930/2.jpg");
		
		//출력 영역을 수정
		g.setClip(120,100,300,300);
		
		
		
		//그림 출력
		//g.drawImage(image, 100,100,this);
		//g.drawImage(image, 100, 100, 300, 300, this);	
		
		//0,0에서 1000,1000만큼을 분할해서
		//100,100 부터 200,200까지에 출력
		g.drawImage(image, 100,100, 200,200, 0,0,1000,1000, this);
		//좌우대칭
		g.drawImage(image, 200,100, 100,200, 0,0,1000,1000, this);
		
		//g.drawImage(image, 100,200, 100,200, 0,0,1000,1000, this);	
		//g.drawImage(image, 200,300, 100,200, 0,0,1000,1000, this);	
		
		
		
		
	}
}
