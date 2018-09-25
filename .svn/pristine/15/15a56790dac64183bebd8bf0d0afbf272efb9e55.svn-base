/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import util.Dispatcher;

/**
 * This abstract interface is used to send commands to balls.
 * @author sn32, ll45
 */
public abstract interface IBallCmd {
	/**
     * The method run by the ball's update method which is called when the ball is updated by the dispatcher.
     * @param context The ball that is calling this method. The context under which the command is to be run.
     * @param disp The Dispatcher that sent the command out.
     */	
    public abstract void apply(Ball context, Dispatcher disp);
}
