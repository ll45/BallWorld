/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

/**
 * This is the class that paints an image of a Sheep.
 * @author sn32, ll45
 */
public class SheepImagePaintStrategy extends UprightImagePaintStrategy {
	/**
	 * This is the constructor that calls its super constructor on the proper image.
	 */
	public SheepImagePaintStrategy() {
		super("images/Sheep.gif", 1.0);
	}
}
