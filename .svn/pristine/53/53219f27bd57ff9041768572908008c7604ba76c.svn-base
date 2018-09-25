/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Container;

/**
 * This is an interface which defines the functions that the model wants the view to have/do.
 * @author sn32, kyl3
 */
public interface IModel2ViewAdapter {
	/**
	 * This is an update function that we want the view to have.
	 */
	public void update();
	
	/**
	 * This is function that gets the canvas from the view.
	 * @return A container that is the canvas that is being drawn on.
	 */
	public Container getCanvas();

	/**
	 * This is a variable that defines the functions the view should have, so
	 * the adapter is always valid.
	 */
	 public static final IModel2ViewAdapter NULL_OBJECT = new IModel2ViewAdapter() {
		 /**
		  * This is an update function that we want the view to have.
		  */
		 public void update() {
		 }
		 
		 /**
		  * This is a function that gets the canvas from the view.
		  * @return A container that is initially null.
		  */
		 public Container getCanvas() {
			 return null;
		 }
	 };
}
