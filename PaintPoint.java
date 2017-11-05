import java.awt.Graphics;
import java.awt.Color;

public class PaintPoint {

	private final int _x;
	private final int _y;
	private final int _size;
	private final int _color1;
	private final int _color2;
	private final int _color3;
	
	public PaintPoint(int x, int y, int size, int color1, int color2, int _Color3 ) {
		_x = x;
		_y = y;
		_size = size;
		_color1 = color1;
		_color2 = color2;
		_color3 = _Color3;
		
	}
	
	public int getX() {
		return _x;
	}

	public int getY() {
		return _y;
	}
	
	public void draw(Graphics g) {
		Color customColor = new Color(_color1,_color2,_color3);
		g.setColor(customColor);
		
		g.fillOval(_x, _y, _size, _size);

	}
}
