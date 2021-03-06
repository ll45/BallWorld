/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

/**
 * This is the class that paints an image of a soccer ball.
 * @author sn32, ll45
 */
public class SoccerImagePaintStrategy extends ImagePaintStrategy {
	/**
	 * This is the constructor that calls its super constructor on the proper image.
	 */
	public SoccerImagePaintStrategy() {
		super("images/Soccer.gif", 1.0);
	}
}
