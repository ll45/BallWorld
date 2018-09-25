/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Graphics;
import java.awt.geom.AffineTransform;

/**
 * This is an abstract class that defines the top level affine transform based
 * paint strategy.
 * @author sn32, ll45
 */
public abstract class APaintStrategy implements IPaintStrategy {
	/**
	 * This private variable holds the Affine Transform for the class.
	 */
	AffineTransform at;
	
	/**
	 * This is the default constructor.
	 */
	public APaintStrategy() {
	}
	
	/**
	 * This is the constructor that takes in Affine Transform.
	 * @param at An Affine Transform
	 */
	public APaintStrategy(AffineTransform at) {
		this.at = at;
	}
	
	/**
	 * This function inits the ball.
	 */
	public void init(Ball ball){
	}
	
	/**
	 * This function paints the ball on the passed in Graphics object.
	 */
	public void paint(Graphics g, Ball ball) {
		double scale = ball.getRad();
		at.setToTranslation(ball.getLoc().x, ball.getLoc().y);
		at.scale(scale, scale);
		at.rotate(ball.getVel().x, ball.getVel().y);
		g.setColor(ball.getCol());    
		paintCfg(g, ball);
		paintXfrm(g, ball, at);
	}
	
	/**
	 * This method allows the subclass to inject additional processing into the
	 * paint method process before the final transformations are performed.
	 * @param g A graphics object
	 * @param host A ball
	 */
	protected void paintCfg(Graphics g, Ball host) {
	}
	
	/**
	 * This is a getter that returns the Affine Transform
	 * @return An Affine Transform
	 */
	public AffineTransform getAT() {
		return this.at;
	}
	
	/**
	 * This function is a secondary paint operation that is the last step of the above
	 * paint method, which does not calculate its own affine transform, but instead,
	 * uses a supplied affine transform.
	 * @param g A graphics object
	 * @param host The host ball
	 * @param at An Affine Transform
	 */
	public abstract void paintXfrm(Graphics g, Ball host, AffineTransform at);
}