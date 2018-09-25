/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

/**
 * This is the class that paints an image of Mars.
 * @author sn32, ll45
 */
public class MarsImagePaintStrategy extends ImagePaintStrategy {
	/**
	 * This is the constructor that calls its super constructor on the proper image.
	 */
	public MarsImagePaintStrategy() {
		super("images/Mars.gif", 1.0);
	}
}
