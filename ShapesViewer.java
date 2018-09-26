import javax.swing.JFrame;

// File: Student
// Name: Linden Kyaw
// Student ID: 100263295

/**
   A class which creates the frame where graphics can be viewed.
*/
public class ShapesViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();

		final int FRAME_WIDTH = 1000;
		final int FRAME_HEIGHT = 700;

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ShapesComponent component = new ShapesComponent();
		frame.add(component);
		
		frame.setVisible(true);
   }
}