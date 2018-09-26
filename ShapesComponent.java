// File: Student
// Name: Linden Kyaw
// Student ID: 100263295

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.util.ArrayList;

/**
   Creates a new shape object where it is called to draw 
*/
public class ShapesComponent extends JComponent
{
	private Timer t;
	private Random random = new Random();
	private ArrayList<Shape3Animated> shapes = new ArrayList<Shape3Animated>();
	private Shape3Animated shape; 
	
	
	/**
	   Creates a new shape object and stores it in an arrayList
	*/
	public ShapesComponent()
	{
		
		for(int i = 0; i < 15; i++)
		{
			int x = random.nextInt(800)+100;
			int y = random.nextInt(500)+100;
			int r = random.nextInt(29 + 1) + 10;
			shape = new Shape3Animated(x, y, r);
			shapes.add(i, shape);
		}
	
	}
	
	
	/**
	   Creates a timer object
	*/
	private void startTimer()
	{
		class TimerListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				repaint();
			}
		}
       
        t = new Timer(20, new TimerListener());
        t.start(); 
	}
	
	/**
	Runs a for each loop to draw and move each object.
	@param Graphics2D g, the drawing component
	*/
	public void paintComponent(Graphics g)
	{	

		Graphics2D g2 = (Graphics2D) g;
		for(Shape3Animated s : shapes)
		{
			s.move(g2);
			startTimer();
		}

	}
	
}