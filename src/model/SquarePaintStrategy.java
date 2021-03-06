/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Graphics;

/**
 * This is the square paint strategy that paints a square.
 * @author sn32, ll45
 */
public class SquarePaintStrategy implements IPaintStrategy {
	/**
	 * By default, does nothing for initialization.
	 */
	public void init(Ball ball){
		
	}

	/**
	 * Paints a square on the given graphics context using the color and radius 
	 * provided by the host. 
	 * @param g The Graphics context that will be paint on
	 * @param ball The host Ball that the required information will be pulled from.
	 */
	@Override
	public void paint(Graphics g, Ball ball) {
		int halfSide = ball.getRad();
		g.setColor(ball.getCol());
		g.fillRect(ball.getLoc().x - halfSide, ball.getLoc().y - halfSide, 2 * halfSide, 2 * halfSide);
	} 
}