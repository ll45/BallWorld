/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Observable;
import java.util.Observer;

import util.Dispatcher;

/**
 * This is the Ball class, which is what is drawn on the screen, and implements
 * Observer to use dispatching.
 * @author sn32, kyl3, lka2, swong
 */
public class Ball implements Observer {
	/**
	 * This is a private variable that holds the color of the ball.
	 */
	private Color col;
	
	/**
	 * This is a private variable which holds the location of the ball.
	 */
	private Point loc;
	
	/**
	 * This is a private variable which holds the radius of the ball.
	 */
	private int rad;
	
	/**
	 * This is a private variable which holds the velocity of the ball in both directions.
	 */
	private Point vel;
	
	/**
	 * This is a private variable which holds the Container (component) that the ball is drawn on.
	 */
	private Container con;
	
	/**
	 * This is a private variable that holds the current movement strategy of the ball.
	 */
	private IUpdateStrategy strat;
	
	/**
	 * This is a private variable that holds the current paint strategy of the ball.
	 */
	private IPaintStrategy paintStrat;
	
	/**
	 * This private variable is an iteration counter that we use to decide when to change certain
	 * characteristics in the update strategy.
	 */
	private int itr = 0;
	
	/**
	 * This is a private variable that sets how much the ball's radius should change when we want to 
	 * update the radius.
	 */
	private int radDelta;
	
	/**
	 * This is the Ball constructor, which sets its initial values.
	 * @param col The color of the ball
	 * @param loc The initial location of the ball.
	 * @param rad The radius of the ball.
	 * @param vel The initial velocity of the ball.
	 * @param con The container (component) on which the ball is drawn.
	 * @param updateStrat The IUpdateStrategy that decides how to update the ball.
	 * @param paintStrat The IPaintStrategy that decides how to paint the ball.
	 */
	public Ball(Color col, Point loc, int rad, Point vel, Container con, IUpdateStrategy updateStrat, IPaintStrategy paintStrat) {
		setCol(col);
		setLoc(loc);
		setRad(rad);
		setVel(vel);
		setCon(con);
		setStrat(updateStrat);
		setRadDelta(5);
		setPaintStrat(paintStrat);
		paintStrat.init(this);
	}

	/**
	 * This returns the location of the ball.
	 * @return the loc
	 */
	public Point getLoc() {
		return loc;
	}

	/**
	 * This sets the location of the ball.
	 * @param loc the loc to set
	 */
	public void setLoc(Point loc) {
		this.loc = loc;
	}

	/**
	 * This returns the radius of the ball.
	 * @return the rad
	 */
	public int getRad() {
		return rad;
	}

	/**
	 * This sets the radius of the ball.
	 * @param rad the rad to set
	 */
	public void setRad(int rad) {
		this.rad = rad;
	}
	
	/**
	 * This function tells the ball to update its current location by the respective velocity
	 * component.
	 */
	public void move() {
		setLoc(new Point(getLoc().x + getVel().x, getLoc().y + getVel().y));
	}
	
	/**
	 * This function is required when implementing Observer, that tells the ball what to
	 * do when it is notified by the dispatcher.
	 * @param o An observable
	 * @param cmd An Object, which should be an IBallCmd
	 */
	public void update(Observable o, Object cmd) {
		((IBallCmd) cmd).apply(this, (Dispatcher) o);
	}
	
	/**
	 * This function determines how to paint the ball, and it delegates
	 * to the paint strategy's paint.
	 * @param g The graphics object to paint on.
	 */
	public void paint(Graphics g) {
		getPaintStrat().paint(g, this);
//		g.setColor(this.getCol());
//		g.fillOval(this.getLoc().x - getRad(), this.getLoc().y - getRad(), getRad() * 2, getRad() * 2);
	}

	/**
	 * This returns the velocity.
	 * @return the vel
	 */
	public Point getVel() {
		return vel;
	}

	/**
	 * This sets the velocity.
	 * @param vel the vel to set
	 */
	public void setVel(Point vel) {
		this.vel = vel;
	}

	/**
	 * This returns the container.
	 * @return the con
	 */
	public Container getCon() {
		return con;
	}

	/**
	 * This sets the container.
	 * @param con the con to set
	 */
	public void setCon(Container con) {
		this.con = con;
	}

	/**
	 * This function returns the ball's movement strategy.
	 * @return the strat
	 */
	public IUpdateStrategy getStrat() {
		return strat;
	}

	/**
	 * This function sets the ball's movement strategy.
	 * @param strat the strat to set
	 */
	public void setStrat(IUpdateStrategy strat) {
		this.strat = strat;
	}

	/**
	 * This function returns the color.
	 * @return the col
	 */
	public Color getCol() {
		return col;
	}

	/**
	 * This function sets the color of the ball.
	 * @param col the col to set
	 */
	public void setCol(Color col) {
		this.col = col;
	}

	/**
	 * This function returns the current iteration of the ball.
	 * @return the itr
	 */
	public int getItr() {
		return itr;
	}

	/**
	 * This function sets the current iteration of the ball.
	 * @param itr the itr to set
	 */
	public void setItr(int itr) {
		this.itr = itr;
	}

	/**
	 * This function returns the radius delta.
	 * @return the radDelta
	 */
	public int getRadDelta() {
		return radDelta;
	}

	/**
	 * This function sets the radius delta.
	 * @param radDelta the radDelta to set
	 */
	public void setRadDelta(int radDelta) {
		this.radDelta = radDelta;
	}
	
	/**
	 * This function checks to see if the ball has come into contact with one of the boundaries of the 
	 *  panel. If it has, this function reverses the velocity of the ball, simulating a rebound off
	 *  of the wall. If, due to the delay of the GUI thread, the ball has passed one of the panel
	 *  boundaries, this function moves the ball to the location it would be at if it had properly 
	 *  bounced off of the wall, and sets the velocity to its appropriate value.
	 */
	public void bounce() {
		// Boundaries of the window
		int rightWall = getCon().getWidth();
		int bottomWall = getCon().getHeight();
		int leftWall = 0;
		int topWall = 0;
		
		int leftX = getLoc().x - getRad();
		int rightX = getLoc().x + getRad();
		
		int bottomY = getLoc().y + getRad();
		int topY = getLoc().y - getRad();
		
		int maxX = rightWall - getRad();
		int minX = getRad();
		
		int maxY = bottomWall - getRad();
		int minY = getRad();

		// Collision detected with left or right wall.
		if (leftX == leftWall || rightX == rightWall) {
			setVel(new Point(getVel().x * -1, getVel().y));
		}
		// Animation goes beyond right wall.
		else if (rightX > rightWall) {
			int diff = getLoc().x - maxX;
			setLoc(new Point(maxX - diff, getLoc().y));
			setVel(new Point(getVel().x * -1, getVel().y));
		}
		// Animation goes beyond left wall.
		else if (leftX < leftWall) {
			int diff = minX - getLoc().x;
			setLoc(new Point(minX + diff, getLoc().y));
			setVel(new Point(getVel().x * -1, getVel().y));
		}
		// Collision detected with top or bottom wall.
		else if (topY == topWall || bottomY == bottomWall) {
			setVel(new Point(getVel().x, getVel().y * -1));
		}
		// Animation goes beyond bottom wall.
		else if (bottomY > bottomWall) {
			int diff = getLoc().y - maxY;
			setLoc(new Point(getLoc().x, maxY - diff));
			setVel(new Point(getVel().x, getVel().y * -1));
		}
		// Animation goes beyond top wall.
		else if (topY < topWall) {
			int diff = minY - getLoc().y;
			setLoc(new Point(getLoc().x, minY + diff));
			setVel(new Point(getVel().x, getVel().y * -1));
		}
	}

	/**
	 * This function returns the paint strategy.
	 * @return the paintStrat
	 */
	public IPaintStrategy getPaintStrat() {
		return paintStrat;
	}

	/**
	 * This function sets the paint strategy.
	 * @param paintStrat the paintStrat to set
	 */
	public void setPaintStrat(IPaintStrategy paintStrat) {
		this.paintStrat = paintStrat;
		getPaintStrat().init(this);
	}
}