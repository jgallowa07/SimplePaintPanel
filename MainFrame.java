import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MainFrame extends JFrame {
	
	private final PaintPanel _paintPanel;
	private final JButton _SizeBig;
	private final JButton _SizeMedium;
	private final JButton _SizeSmall;
	private final JButton _ColorRed;
	private final JSlider _YellowSlider;
	private final JButton _clearbutton;
	private final JButton _ColorBlue;
	private final JSlider _BlueSlider;
	private final JSlider _GreenSlider;
	private final JButton _ColorCyan;	
	private final JButton _ColorYellow;
	
	public MainFrame() {
		super("YO");
		setLayout(new BorderLayout());
		
		_paintPanel = new PaintPanel();
		_paintPanel.setPreferredSize(new Dimension(800, 800));
		
		add(_paintPanel,BorderLayout.CENTER);
	
		
		_SizeBig = new JButton("Big");
		_SizeBig.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				_paintPanel._Size = 30;
			}			
		});

		
		_SizeMedium = new JButton("Medium");
		_SizeMedium.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				_paintPanel._Size = 15;
			}			
		});
		
		_SizeSmall = new JButton("Small");
		_SizeSmall.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				_paintPanel._Size = 5;
			}			
		});

		_BlueSlider = new JSlider(JSlider.HORIZONTAL,0,255,0);
		_BlueSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				int now = _BlueSlider.getValue();
				_paintPanel._Color3 = now;
				
			}	
		});
		
		_YellowSlider = new JSlider(JSlider.HORIZONTAL,0,255,0);
		_YellowSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				int now = _YellowSlider.getValue();
				_paintPanel._Color2 = now;
				
			}	
		});
		
		_GreenSlider = new JSlider(JSlider.HORIZONTAL,0,255,0);
		_GreenSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				int now = _GreenSlider.getValue();
				_paintPanel._Color1 = now;
				
			}	
		});
		
		_ColorBlue = new JButton("Blue");
		_ColorBlue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				_paintPanel._Color1 = 0;
				_paintPanel._Color2 = 0;
				_paintPanel._Color3 = 255;
				
			}			
		});
		
		_ColorYellow = new JButton("Yellow");
		_ColorYellow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				_paintPanel._Color1 = 255;
				_paintPanel._Color2 = 255;
				_paintPanel._Color3 = 0;
				
			}			
		});
		
		_ColorCyan = new JButton("Cyan");
		_ColorCyan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				_paintPanel._Color1 = 0;
				_paintPanel._Color2 = 255;
				_paintPanel._Color3 = 255;
				
			}			
		});
		
		_ColorRed = new JButton("Red");
		_ColorRed.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				_paintPanel._Color1 = 255;
				_paintPanel._Color2 = 0;
				_paintPanel._Color3 = 0;
				
			}			
		});
		
		_clearbutton = new JButton("Clear");
		_clearbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				_paintPanel._points.clear();
				_paintPanel.repaint();
			}			
		});
		
		JPanel bottomButtonPanel = new JPanel(new GridLayout(1,4));
		bottomButtonPanel.add(_ColorRed);
		bottomButtonPanel.add(_ColorYellow);
		bottomButtonPanel.add(_ColorCyan);
		bottomButtonPanel.add(_ColorBlue);

		JPanel bottomSliderPanel = new JPanel(new GridLayout(1,3));
		bottomSliderPanel.add(_GreenSlider);
		bottomSliderPanel.add(_BlueSlider);
		bottomSliderPanel.add(_YellowSlider);
		
		JPanel topbuttonPanel = new JPanel(new GridLayout(1,4));
		topbuttonPanel.add(_SizeBig);
		topbuttonPanel.add(_SizeMedium);
		topbuttonPanel.add(_SizeSmall);
		topbuttonPanel.add(_clearbutton);
		add(topbuttonPanel,BorderLayout.NORTH);
		
		JPanel BottomPanel = new JPanel(new GridLayout(2,1));
		BottomPanel.add(bottomButtonPanel);
		BottomPanel.add(bottomSliderPanel);
		add(BottomPanel,BorderLayout.SOUTH);
		
	}
}
