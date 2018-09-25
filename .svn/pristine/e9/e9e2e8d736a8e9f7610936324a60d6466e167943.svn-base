/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Graphics;
import java.awt.geom.AffineTransform;

/**
 * This class defines a multi paint strategy which is the composition of other paint strategies.
 * @author sn32, ll45
 */
public class MultiPaintStrategy extends APaintStrategy {
	/**
	 * This is a private variable that holds the paint strategies to be composed.
	 */
	private APaintStrategy[] pstrats;

	/**
	 * This is a constructor that doesn't take in an affine transform.
	 * @param pstrats An array of APaintStrategies
	 */
	public MultiPaintStrategy(APaintStrategy[] pstrats) {
		super(new AffineTransform());
		this.pstrats = pstrats;
	}
	
	/**
	 * This is the default constructor.
	 */
	public MultiPaintStrategy() {
		
	}
	
	/**
	 * This is a constructor that does take in an affine transform.
	 * @param at An affine transform
	 * @param pstrats An array of APaintStrategies
	 */
	public MultiPaintStrategy(AffineTransform at, APaintStrategy[] pstrats) {
		super(at);
		this.pstrats = pstrats;
	}
	
	/**
	 * This function initializes the ball.
	 */
	public void init(Ball ball){
		for (APaintStrategy strategy : pstrats) {
		    strategy.init(ball);
		}
	}
	
	/**
	 * This function is a secondary paint operation that is the last step of
	 * the above paint method, which does not calculate its own affine transform,
	 * but instead, uses a supplied affine transform. 
	 */
	@Override
	public void paintXfrm(Graphics g, Ball ball, AffineTransform at) {
		for (APaintStrategy strategy : pstrats) {
			strategy.paintXfrm(g, ball, at);
		}
	}
}