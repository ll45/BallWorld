/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Point;

import util.Dispatcher;

/**
 * This class defines a Fast Strategy that makes the ball's velocity increase and stop once it reaches
 * a pre defined max speed.
 * @author sn32, lka2
 */
public class FastStrategy implements IUpdateStrategy {
	/**
	 * This function updates the state of the ball using a dispatcher.
	 */
	@Override
	public void updateState(Ball ball, Dispatcher dispatcher) {
		dispatcher.notifyAll(new IBallCmd() {
			/**
			 * This function applies the command to the ball, if it is the correct ball,
			 * using the dispatcher.
			 */
			@Override
			public void apply(Ball other, Dispatcher disp) {
				if (ball.equals(other)) {
					if (Math.abs(ball.getVel().x) < 100 && Math.abs(ball.getVel().y) < 100) {
						if (ball.getItr() % 10 == 0) {
							if (ball.getVel().x > 0 && ball.getVel().y > 0) {
								ball.setVel(new Point(ball.getVel().x + 2, ball.getVel().y + 2));
							} else if (ball.getVel().x > 0 && ball.getVel().y < 0) {
								ball.setVel(new Point(ball.getVel().x + 2, ball.getVel().y - 2));
							} else if (ball.getVel().x < 0 && ball.getVel().y > 0) {
								ball.setVel(new Point(ball.getVel().x - 2, ball.getVel().y + 2));
							} else if (ball.getVel().x < 0 && ball.getVel().y < 0) {
								ball.setVel(new Point(ball.getVel().x - 2, ball.getVel().y - 2));
							}
						}
					}
				}
			}
		});
	}
}