/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

/**
 * This is the class that paints an image of Venus.
 * @author sn32, ll45
 */
public class VenusImagePaintStrategy extends ImagePaintStrategy {
	/**
	 * This is the constructor that calls its super constructor on the proper image.
	 */
	public VenusImagePaintStrategy() {
		super("images/Venus.gif", 1.0);
	}
}
