/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import util.Dispatcher;

/**
 * This class defines a Straight Strategy which defines a movement strategy for a ball that just
 * moves by changing it's location by its velocity components.
 * @author sn32, lka2
 */
public class StraightStrategy implements IUpdateStrategy {
	/**
	 * This function updates the state of the ball such that it moves in straight lines and
	 * bounces off of walls. Because the basic move method is implemented in Ball, there is 
	 * nothing else to update in this strategy's update.
	 */
	@Override
	public void updateState(Ball ball, Dispatcher dispatcher) {
		dispatcher.notifyAll(new IBallCmd() {
			/**
			 * This function applies the changes to the correct ball.
			 */
			@Override
			public void apply(Ball other, Dispatcher disp) {
			}
		});
	}
}