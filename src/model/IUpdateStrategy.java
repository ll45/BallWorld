/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import util.Dispatcher;

/**
 * This interface defines the functions we want IUpdateStrategies to have.
 * @author sn32, lka2
 */
public interface IUpdateStrategy {
	/**
	 * This function will update the ball depending on how it is later defined.
	 * @param ball A ball of type Ball
	 * @param dispatcher A Dispatcher
	 */
	public void updateState(Ball ball, Dispatcher dispatcher);
}
