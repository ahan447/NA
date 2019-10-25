package graphic;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {

	public Color color =
			new Color(0,0,128);
	
	public String sul = "술";
	
	public void paint(Graphics g) {
		g.setColor(color);
		g.drawString("불금은뭐다?",100, 50);
		g.drawString(sul+"~",100, 100);
	}
	
}
