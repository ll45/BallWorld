/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

/**
 * This class defines a shape paint strategy.
 * @author sn32, ll45
 */
public class ShapePaintStrategy extends APaintStrategy implements IShapeFactory {
	/**
	 * This is a private variable that holds the shape.
	 */
	Shape shape;
	
	/**
	 * The constructor sets the shape.
	 * @param shape A shape.
	 */
	public ShapePaintStrategy(Shape shape) {
		this.shape = shape;
	}
	
	/**
	 * This constructor sets the shape and takes an Affine Transform.
	 * @param at An Affine Transform
	 * @param shape A shape.
	 */
	public ShapePaintStrategy(AffineTransform at, Shape shape) {
		super(at);
		this.shape = shape;
	}
	
	/**
	 * This is a secondary paint operation that is the last step of the above paint method,
	 * which does not calculate its own affine transform, but instead, uses a supplied affine transform. 
	 */
	public void paintXfrm(Graphics g, Ball host, AffineTransform at){ 
		((Graphics2D) g).fill(at.createTransformedShape(shape));
	}

	/**
	 * This function makes the shape.
	 */
	@Override
	public Shape makeShape(double x, double y, double xScale, double yScale) {
		at.setToTranslation(x, y);
		at.scale(x * xScale, y * yScale);  // optional rotation can be added as well
		return at.createTransformedShape(shape);
	}
}