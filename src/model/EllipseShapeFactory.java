/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 * This class defines a shape factory to make Ellipses.
 * @author sn32, ll45
 *
 */
public class EllipseShapeFactory implements IShapeFactory {
	/**
	 * This is a static singleton variable that can be used to make ellipses.
	 */
	public static final EllipseShapeFactory Singleton = new EllipseShapeFactory();

	/**
	 * This is the function that actual makes and returns the shape.
	 */
	@Override
	public Shape makeShape(double x, double y, double xScale, double yScale) {
		Shape ellipse = new Ellipse2D.Double(x, y, xScale, yScale);
		return ellipse;
	}
}