/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Shape;

/**
 * This interface defines the methods we want a shape factory to have.
 * @author sn32, ll45
 *
 */
public interface IShapeFactory {
	/**
	 * This function creates a shape.
	 * @param x Double for the x location
	 * @param y Double for the y location
	 * @param xScale The horizontal scaling
	 * @param yScale The vertical scaling
	 * @return A shape object
	 */
	public Shape makeShape(double x, double y, double xScale, double yScale);
}
