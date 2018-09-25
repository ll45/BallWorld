/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Rectangle;

import util.Dispatcher;
import util.Randomizer;

/**
 * This class defines a Teleport Strategy which defines a movement strategy for a ball that randomly
 * changes the location of it, so it teleports.
 * @author sn32, lka2
 */
public class TeleportStrategy implements IUpdateStrategy {
	/**
	 * This function updates the state of the ball, by modifying its location to give it the
	 * appearance of teleporting when it moves.
	 */
	@Override
	public void updateState(Ball ball, Dispatcher dispatcher) {
		dispatcher.notifyAll(new IBallCmd() {
			/**
			 * This function applies the changes to the correct ball.
			 */
			@Override
			public void apply(Ball other, Dispatcher disp) {
				if (ball.equals(other)) {
					Randomizer rzr = Randomizer.Singleton;
					if (ball.getItr() % 80 == 0) {
						ball.setLoc(rzr.randomLoc(new Rectangle(ball.getCon().getWidth() - ball.getRad(), ball.getCon().getHeight() - ball.getRad())));
						ball.setCol(rzr.randomColor());
					}
				}
			}
		});
	}
}