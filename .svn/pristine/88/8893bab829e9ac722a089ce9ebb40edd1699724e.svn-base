/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 * This class defines a shape factory to make Rectangles.
 * @author sn32, ll45
 *
 */
public class RectangleShapeFactory implements IShapeFactory {
	/**
	 * This is a static singleton variable that can be used to make Rectangles.
	 */
	public static final RectangleShapeFactory Singleton = new RectangleShapeFactory();

	/**
	 * This is the function that actual makes and returns the shape.
	 */
	@Override
	public Shape makeShape(double x, double y, double xScale, double yScale) {
		Shape rect = new Rectangle2D.Double(x, y, xScale, yScale);
		return rect;
	}
}