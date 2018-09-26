// File: Student
// Name: Linden Kyaw
// Student ID: 100263295

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.*;


 /**
The class extends the Shape1 class and creates another ellipse
*/
public class Shape2 extends Shape1
{
	  /**
	Assignes the given parameters to the private variables of the super class
	@param r, radius the length from the midpoint to the edge of shape
	@param x the x coordinate of the shape
	@param y the y coordinate of the shape
	*/
	public Shape2(double x, double y, double r)
	{
		super(x, y, r);
	}
	
	 /**
	Creates the ellipse of the super class and another ellipse that is filled with the same colour
	@param Graphics2D g2, the drawing component
	*/
	public void draw(Graphics2D g2)
	{
		super.draw(g2);
		g2.setColor(col);
		Ellipse2D.Double shape2 = new Ellipse2D.Double(getX() - getRadius(), getY() - 2*getRadius(), 
											2*getRadius(), 4*getRadius());
		g2.fill(shape2);
		g2.draw(shape2);
	}
}