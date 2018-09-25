/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Color;

import util.Dispatcher;
import util.Randomizer;

/**
 * This class defines a Color Strategy, which changes the ball's color.
 * @author sn32, lka2
 */
public class ColorStrategy implements IUpdateStrategy {
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
					if (ball.getItr() % 10 == 0) {
						Color newColor = Randomizer.Singleton.randomColor();
						ball.setCol(newColor);
					}
				}
			}
		});
	}
}