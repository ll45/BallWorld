/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Point;

import util.Dispatcher;

/**
 * This class defines a spawn strategy that interacts with other balls.
 * @author sn32, ll45
 */
public class SpawnStrategy implements IUpdateStrategy {
	/**
	 * This is a tick counter that delays before another ball spawns.
	 */
	private int count = 0; // tick counter that counts out the delay before another ball can be spawned.
	
	/**
	 * This is a tick delay which increases to keep spawning from being exponential.s
	 */
	private int delay = 100;  // tick delay which increases at each spawn to keep total spawn rate from exponentially exploding.

	/**
	 * This function updates the state of the ball.
	 */
	@Override
	public void updateState(final Ball context, Dispatcher dispatcher) {
		if (delay < count++) {
			dispatcher.notifyAll(new IBallCmd() {
				/**
				 * This function applies this command to the correct ball using a dispatcher.
				 */
				@Override
				public void apply(Ball other, Dispatcher disp) {
					if (count != 0 && context != other) {
						if ((context.getRad() + other.getRad()) > 
						    context.getLoc().distance(other.getLoc())) {
							disp.addObserver(new Ball(
									context.getCol(),
									new Point(context.getLoc()), 
									context.getRad(),
									new Point(-context.getVel().x+1,-context.getVel().y+1), 
									context.getCon(), 
									new SpawnStrategy(), 
									context.getPaintStrat()));
							count = 0;
							delay *= 5;
						}
					}
				}
			});
		}
	}
}
