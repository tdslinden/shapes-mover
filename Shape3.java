// File: Student
// Name: Linden Kyaw
// Student ID: 100263295

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.*;

 /**
The class extends the Shape2 class and creates a rectangle
*/
public class Shape3 extends Shape2
{
	  /**
	Assignes the given parameters to the private variables of the super class
	@param r, radius the length from the midpoint to the edge of shape
	@param x the x coordinate of the shape
	@param y the y coordinate of the shape
	*/
	public Shape3(double x, double y, double r)
	{
		super(x, y, r);
	}
	
	 /**
	Creates the ellipse of the super class, ellipse from Shape2 
	and a rectangle that is filled with the same colour
	@param Graphics2D g2, the drawing component
	*/
	public void draw(Graphics2D g2)
	{
		super.draw(g2);
		g2.setColor(col);
		Rectangle2D.Double shape3 = new Rectangle2D.Double(getX() - 1.5*getRadius(), getY() - 1.5*getRadius(), 
												  3*getRadius(), 3*getRadius());
		g2.fill(shape3);
		g2.draw(shape3);
	}
}
	