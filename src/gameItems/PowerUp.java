package gameItems;

import java.awt.*;

/** 
 * The x and y relate to the top left position of the power up. The size is the
 * diameter of the circle.
 * 
 * @author Jordan Barraclough
 *
 */
public class PowerUp {
	//FIELDS
	protected int x, y, size;
	protected Color color;
	
	//CONSTRUCTOR
	public PowerUp(int x, int y, int size){
		
	}
	
	//FUNCTIONS
	/**
	 * Draw the power up
	 * 
	 * @param g
	 *            The graphic the power up needs to be drawn to.
	 */
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillOval(x, y, size, size);
	}
}
