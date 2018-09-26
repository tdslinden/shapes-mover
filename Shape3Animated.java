// File: Student
// Name: Linden Kyaw
// Student ID: 100263295

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

 /**
The class extends the Shape3 class and moves the shape
*/
public class Shape3Animated extends Shape3 
{
	private int direction;//indicates a rand0m direction
	private int velocity;//indicates speed
	private Random random = new Random();
	
	/**
	Assignes the given parameters to the private variables of the super class
	@param r, radius the length from the midpoint to the edge of shape
	@param x the x coordinate of the shape
	@param y the y coordinate of the shape
	*/
	public Shape3Animated(double x, double y, double r)
	{
		super(x, y, r);
		direction = random.nextInt(6+1) + 1;
		velocity = random.nextInt(10);
	}
	
	/**
	Moves the shape depending on the random direction
	and prevents the shape from going outside of frame
	@param Graphics2D g2, the drawing component
	*/
	public void move(Graphics2D g2)
	{
		super.draw(g2);
		if(direction == 1)
		{
			set(getX(), getY() + velocity);
		}
		
		if(direction == 2)
		{
			set(getX(), getY() - velocity);
		}
		
		if(direction == 3)
		{
			set(getX() -  velocity, getY());
		}
		
		if(direction == 4)
		{
			set(getX() + velocity, getY());
		}
		
		if(direction == 5)
		{
			set(getX() + velocity, getY() + velocity);
		}
		
		if(direction == 6)
		{
			set(getX() - velocity, getY() - velocity);
		}
		
		if(getX() <= 0 + getRadius())
		{
			velocity = -velocity;
		}
		else if(getX() >= 1000 - getRadius())
		{
			velocity = -velocity;
		}
		
		if(getY() <=0 + getRadius())
		{
			velocity = -velocity;
		}
		else if(getY() >= 700 - getRadius())
		{
			velocity = -velocity;
		}
		
	}
}