/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

/**
 * This is the class that paints an upright composite shape, a combination of Mars and Mario.
 * @author sn32, ll45
 */
public class MarioMarsImagePaintStrategy extends MultiPaintStrategy {
	/**
	 * This is the constructor that calls its super constructor on the proper combination of images.
	 */
	public MarioMarsImagePaintStrategy() {
		super(new APaintStrategy[]{new UprightImagePaintStrategy("images/Mars.gif", 1.0),
				new UprightImagePaintStrategy("images/Mario.gif", 1.0)});
	}
}