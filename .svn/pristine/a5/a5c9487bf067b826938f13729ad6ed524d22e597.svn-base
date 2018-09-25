/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import util.Dispatcher;

/**
 * This class defines a Multi Strategy which defines a movement strategy for a ball
 * is a combination of 2 other strategies.
 * @author sn32, lka2
 */
public class MultiStrategy implements IUpdateStrategy {
	/**
	 * These private variables define the 2 update strategies that compose
	 * the Multi Strategy.
	 */
	private IUpdateStrategy s1, s2;
	
	/**
	 * This constructor requires the 2 strategies that will be combined. It sets
	 * the 2 private variables to the inputs.
	 * @param s1 The first strategy, an IUpdateStrategy.
	 * @param s2 The second strategy, an IUpdateStrategy.
	 */
	public MultiStrategy(IUpdateStrategy s1, IUpdateStrategy s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	/**
	 * This function updates the state of the ball by delegating to each strategy and telling
	 * them to update the ball.
	 */
	@Override
	public void updateState(Ball ball, Dispatcher dispatcher) {
		dispatcher.notifyAll(new IBallCmd() {
			/**
			 * This function applies the command to the correct ball using a dispatcher.
			 */
			@Override
			public void apply(Ball other, Dispatcher disp) {
				if (ball.equals(other)) {
					s1.updateState(ball, disp);
					s2.updateState(ball, disp);
				}
			}
		});
	}
}