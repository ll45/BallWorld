/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Point;

import util.Dispatcher;
import util.Randomizer;

/**
 * This class defines a Wiggle Strategy which defines a movement strategy for a ball that randomly
 * changes the velocity direction, so it wiggles.
 * @author sn32, lka2
 */
public class WiggleStrategy implements IUpdateStrategy {
	/**
	 * This function updates the state of the ball, by modifying its velocity to give it the
	 * appearance of wiggling when it moves.
	 */
	@Override
	public void updateState(Ball ball, Dispatcher dispatcher) {
		dispatcher.notifyAll(new IBallCmd() {
			/**
			 * This function applies the changes to the correct ball using a dispatcher.
			 */
			@Override
			public void apply(Ball other, Dispatcher disp) {
				if (ball.equals(other)) {
					Randomizer rzr = Randomizer.Singleton;
					if (ball.getItr() % rzr.randomInt(2,  100) == 0) {
						ball.setVel(new Point(ball.getVel().x, ball.getVel().y * -1));
					} else if (ball.getItr() % rzr.randomInt(2, 100) == 0){
						ball.setVel(new Point(ball.getVel().x * -1, ball.getVel().y));
					}
				}
			}
		});
	}
}
