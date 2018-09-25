/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Graphics;

/**
 * This is the ball paint strategy, which implements a paint strategy for a ball.
 * @author sn32, ll45
 */
public class BallPaintStrategy implements IPaintStrategy {
	/**
	 * This is the default constructor for BallPaintStrategy.
	 */
	public BallPaintStrategy() {
	}

	/**
	 * This function paints the ball on the graphics object.
	 */
	@Override
	public void paint(Graphics g, Ball ball) {
		g.setColor(ball.getCol());
		g.fillOval(ball.getLoc().x - ball.getRad(), ball.getLoc().y - ball.getRad(),
				ball.getRad() * 2, ball.getRad() * 2);
	}

	/**
	 * This function initializes the ball.
	 */
	@Override
	public void init(Ball ball) {
	}
}