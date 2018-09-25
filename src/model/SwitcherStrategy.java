/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import util.Dispatcher;

/**
 * This class defines a Switcher Strategy which defines a strategy for a ball that can
 * change by updating the strategy.
 * @author sn32, lka2
 */
public class SwitcherStrategy implements IUpdateStrategy {
	/**
	 * This private variable is the current strategy for all balls that
	 * use the Switcher Strategy.
	 */
	private static IUpdateStrategy strategy = new StraightStrategy();
	
	/**
	 * This function updates the state of the ball by applying whatever
	 * strategy is the current one.
	 */
	@Override
	public void updateState(Ball ball, Dispatcher dispatcher) {
		dispatcher.notifyAll(new IBallCmd() {
			/**
			 * This function applies the command to the correct ball.
			 */
			@Override
			public void apply(Ball other, Dispatcher disp) {
				if (ball.equals(other)) {
					strategy.updateState(ball, disp);
				}
			}
		});
	}
	
	/**
	 * This function changes the strategy of all switcher balls to that of the parameter.
	 * @param strat An IUpdateStrategy which is the new strategy for all the balls to use
	 */
	public static void setStrat(IUpdateStrategy strat) {
		SwitcherStrategy.strategy = strat;
	}
	
	/**
	 * This function returns the current strategy of the switcher balls.
	 * @return An IUpdateStrategy which is the current strategy of the switcher balls.
	 */
	public static IUpdateStrategy getStrat() {
		return SwitcherStrategy.strategy;
	}
}