/**
 * This is the view package, which is separate from the model and controller.
 */
package view;

import java.awt.Graphics;


/**
 * This is an interface which has the functions that the view wants the model to have.
 * @author sn32, kyl3, lka2, swong
 */
public interface IView2ModelAdapter<TDropListItem> {
	/**
	 * This is a function that will tell the model to clear the balls.
	 */
	public void clearBalls();
	
	/**
	 * This is a function that will tell the model to paint the balls.
	 * @param g The graphics object to paint on.
	 */
	public void paintBalls(Graphics g);
	
	/**
     * This function will take the given short strategy name and return a corresponding
     * something to put onto both drop lists.
     * @param classname The shortened class name of the desired strategy
     * @return Something to put onto both the drop lists.
     */
    public TDropListItem addStrategy(String classname);

    /**
     * This function will make a ball with the selected short strategy name.
     * @param selectedItem A shorten class name for the desired strategy
     * @param paintStrat A shorten class name for desired paint strategy
     */
    public void makeBall(TDropListItem selectedItem, TDropListItem paintStrat);

    /**
     * This function will return a new object to put on both lists, given two items from the lists.
     * @param selectedItem1 An object from one drop list
     * @param selectedItem2 An object from the other drop list
     * @return An object to put back on both lists.
     */
    public TDropListItem combineStrategies(TDropListItem selectedItem1, TDropListItem selectedItem2);
    
    /**
     * This function will change the current strategy of the switcher balls to whatever
     * strategy is made by the factory in the parameter.
     * @param switchFac An object from the top drop list.
     */
	public void setSwitcherStrategy(TDropListItem switchFac);

	/**
	 * This function returns a strategy factory which makes the update strategy that the switcher
	 * balls currently have.
	 * @return An object that creates the switcher balls current update strategy.
	 */
	public TDropListItem getSwitcherFac();

	public TDropListItem addPaintFactory(String text);
}