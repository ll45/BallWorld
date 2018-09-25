/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Graphics;

/**
 * This class defines an upright multi paint strategy composition.
 * @author sn32, ll45
 */
public class UprightMultiPaintStrategy extends MultiPaintStrategy {
	/**
	 * This constructor calls the super class's.
	 * @param pstrats An array of APaintStrategy
	 */
	public UprightMultiPaintStrategy(APaintStrategy[] pstrats) {
		super(pstrats);
	}
	
	/**
	 * This allows extra processing during painting.
	 */
	protected void paintCfg(Graphics g, Ball host) {
		super.paintCfg(g, host);
		if(Math.abs(Math.atan2(host.getVel().y, host.getVel().x))> Math.PI/2.0) {
			at.scale(1.0, -1.0);
		}       
	}
}
