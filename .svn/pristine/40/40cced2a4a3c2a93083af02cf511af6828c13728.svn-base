/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.geom.AffineTransform;

/**
 * This class defines a paint strategy to paint a rectangle shape.
 * @author sn32, ll45
 */
public class RectanglePaintStrategy extends ShapePaintStrategy {
  
  /**
   * No parameter constructor that creates a prototype rectangle that 
   * has twice the width as height
   * An AffineTranform for internal use is instantiated.
   */
  public RectanglePaintStrategy(){
    this(new AffineTransform(), 0, 0, 4.0/3.0, 1.0/3.0);
  }
  
  /**
   * Constructor that allows the specification of the location, x-radius and y-radius
   * of the prototype ellipse. The AffineTransform to use is given.
   * @param at The AffineTransform to use for internal calculations
   * @param x floating point x-coordinate of center of circle
   * @param y floating point y-coordinate of center of circle
   * @param width floating point x-radius of the circle
   * @param height floating point y-radius of the circle
   */
  public RectanglePaintStrategy(AffineTransform at, double x, double y, double width, double height){
    super(at, RectangleShapeFactory.Singleton.makeShape(x, y, width, height));
  }
}