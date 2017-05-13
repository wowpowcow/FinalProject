package display;


import javax.swing.JFrame;

public class Window
{
	private JFrame frame;
	private int width, height;
	private String title;
	
	public Window(String t,int w, int h )
	{
		title=t;
		width=w;
		height=h;
		
		createDisplay();
	}
	
	private void createDisplay()
	{
		frame = new JFrame(title);
		frame.setSize(width, height);
		// makes sure program closes down properly
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// prevents user from resizing frame
		frame.setResizable(false);
		//makes frame show in center
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
}
