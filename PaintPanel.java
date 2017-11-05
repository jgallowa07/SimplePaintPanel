import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PaintPanel extends JPanel {

	public ArrayList<PaintPoint> _points;
	public int _Size = 30;
	public int _Color1 = 0;
	public int _Color2 = 0;
	public int _Color3 = 0; 
	
	public PaintPanel() {
		
		
		_points = new ArrayList<>();

		MouseAdapter adapter = new MouseAdapter() {
			@Override
		    public void mouseDragged(MouseEvent e){
				PaintPoint point = new PaintPoint(e.getX(), e.getY(),_Size,_Color1,_Color2,_Color3);
				_points.add(point);
				repaint();
			}
		};
		
		addMouseListener(adapter);
		addMouseMotionListener(adapter);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
//		g.setColor(Color.GRAY);
//		g.fillOval(150, 150, 150, 150);
//		g.setColor(Color.BLACK);
//		g.fillRect(0, 0,150,150);
//		g.drawString("hello", 150, 150);
		
		
		
		for (PaintPoint point : _points) {
			point.draw(g);
		}
	}
}
