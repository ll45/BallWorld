/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import util.Dispatcher;

/**
 * This class defines a Breathing Strategy, which grows and shrinks the ball's radius.
 * @author sn32, lka2
 */
public class BreathingStrategy implements IUpdateStrategy {
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
					ball.setRad(ball.getRad() + ball.getRadDelta());
					if (ball.getItr() % 5 == 0) {
						ball.setRadDelta(ball.getRadDelta() * -1);
					}
				}
			}
		});
	}
}