/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import util.Dispatcher;
import util.Randomizer;

/**
 * This class defines a Crash Strategy which makes the ball
 * change color when it bounces from the boundaries of the canvas.
 * @author sn32, lka2
 */
public class CrashStrategy implements IUpdateStrategy {
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
					Randomizer rzr = Randomizer.Singleton;
					
					if ((ball.getLoc().x + ball.getRad() + 8 >= ball.getCon().getWidth()) ||
							(ball.getLoc().x - ball.getRad() <= 8) ||
							(ball.getLoc().y + ball.getRad() >= ball.getCon().getHeight() - 8) ||
							(ball.getLoc().y - ball.getRad() <= 8)) {
						ball.setCol(rzr.randomColor());
					}
				}
			}
		});
	}
}