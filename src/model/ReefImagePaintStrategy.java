/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

/**
 * This is the class that paints an image of a reef.
 * @author sn32, ll45
 */
public class ReefImagePaintStrategy extends UprightImagePaintStrategy {
	/**
	 * This is the constructor that calls its super constructor on the proper image.
	 */
	public ReefImagePaintStrategy() {
		super("images/Reef.gif", 1.0);
	}
}
