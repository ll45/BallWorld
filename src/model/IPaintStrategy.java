/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Graphics;

/**
 * This is an interface for an IPaintStrategy that defines the methods we want it to have.
 * @author sn32, ll45
 */
public interface IPaintStrategy {
	/**
	 * The function that will paint the ball on the given Graphics object.
	 * @param g A graphics object
	 * @param ball The ball to paint.
	 */
	public void paint(Graphics g, Ball ball);
	
	/**
	 * This function initalizes the ball.
	 * @param ball The ball to initialize.
	 */
	public void init(Ball ball);
}