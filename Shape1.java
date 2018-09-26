// File: Student
// Name: Linden Kyaw
// Student ID: 100263295

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.*;

/**
   An ellipse shape with a random colour assigned to it
*/

public class Shape1
{
	private double x, y, r;
	private int R = (int)(Math.random()*256);//creates random int between 0 - 256 for red
	private int G = (int)(Math.random()*256);//creates random int between 0 - 256 for green
	private int B = (int)(Math.random()*256);//creates random int between 0 - 256 for blue
	protected Color col = new Color(R, G, B);
	
	 /**
	Assignes the given parameters to the private variables
	@param r, radius the length from the midpoint to the edge of shape
	@param x the x coordinate of the shape
	@param y the y coordinate of the shape
	*/
	public Shape1(double x, double y, double r)
	{
		this.x = x;
		this.y = y;
		this.r = r;
		
	}
	
	 /**
	Creates an ellipse that is filled with a colour
	@param Graphics2D g2, the drawing component
	*/
	public void draw (Graphics2D g2)
	{
		
		g2.setColor(col);
		Ellipse2D.Double shape1 = new Ellipse2D.Double(getX() - 2*getRadius(), getY() - getRadius(),
											4*getRadius(), 2*getRadius());
		g2.fill(shape1);
		g2.draw(shape1);
	}
	
	 /**
	Returns the radius of the shape
	*/
	public double getRadius()
	{
		return r;
	}
	
	 /**
	Returns the x position of the shape
	*/
	public double getX()
	{
		return x;
	}

	 /**
	Returns the y position of the shape
	*/
	public double getY()
	{
		return y;
	}
	
	 /**
	Sets the x and y position of the shape
	*/
	public void set(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
}