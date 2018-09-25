/**
 * This is the controller package that instantiates and starts the model and view.
 */
package controller;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;

import model.BallWorldModel;
import model.IModel2ViewAdapter;
import model.IStrategyFac;
import view.BallWorldView;
import view.IView2ModelAdapter;

/**
 * This is the BallWorldController, that has private variables for model and view,
 * and is able to interface between them.
 * @author sn32, kyl3, lka2, swong
 *
 */
public class BallWorldController {
	/**
	 * This is an instance of a BallWorldModel, that allows the controller to interface with the model.
	 */
	private BallWorldModel model;

	/**
	 * This is an instance of a BallWorldView, that allows the controller to interface with the view.
	 */
	private BallWorldView<?> view;
	
	/**
	 * This main method starts the BallWorldController.
	 * @param args Command line arguments.
	 */
	public static void main(String [] args) {
		EventQueue.invokeLater(() -> {
			try {
				(new BallWorldController()).start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
	
	/**
	 * This is the constructor for BallWorldController, which
	 * creates anonymous inner classes for the adapters, and defines their functions.
	 */
	public BallWorldController() {
		model = new BallWorldModel(new IModel2ViewAdapter() {

			/**
			 * This function from the IModel2ViewAdapter allows the controller
			 * to tell the view to update.
			 */
			@Override
			public void update() {
				view.updateView();
			}

			/**
			 * This function from the IModel2ViewAdapter allows the controller to get
			 * the canvas from the view.
			 */
			@Override
			public Container getCanvas() {
				return view.getCanvas();
			}
		});
		
		view = new BallWorldView<IStrategyFac>(new IView2ModelAdapter<IStrategyFac>() {
	        /**
	         * Returns an IStrategyFac that can instantiate the strategy specified
	         * by classname. Returns the error strategy factory if classname is null.
	         * The toString() of the returned factory is the classname.
	         * @param classname Shortened name of desired strategy
	         * @return A factory to make that strategy
	         */
			@Override
	        public IStrategyFac addStrategy(String classname) {
	        		return model.makeStrategyFac(classname);
	        	}

	        /**
	         * Add a ball to the system with a strategy as given by the given IStrategyFac
	         * @param selectedItem The fully qualified name of the desired strategy.
	         */
	        @Override
	        public void makeBall(IStrategyFac selectedItem, IStrategyFac paintStrat) {
	        		if (null != selectedItem && paintStrat != null) {
	        			model.makeBall(selectedItem.make(), paintStrat.makePaint());
	        		}
	        	}
			
			/**
			 * Returns an IStrategyFac that can instantiate a MultiStrategy with the
			 * two strategies made by the two given IStrategyFac objects. Returns
			 * the error strategy factory if either supplied factory is null. The
			 * toString() of the returned factory is the toString()'s of the two given
			 * factories, concatenated with "-".
			 * @param selectedItem1 An IStrategyFac for a strategy
			 * @param selectedItem2 An IStrategyFac for a strategy
			 * @return An IStrategyFac for the composition of the two strategies
			 */
	        @Override
			public IStrategyFac combineStrategies(IStrategyFac selectedItem1, IStrategyFac selectedItem2) {
				return model.combineStrategyFacs(selectedItem1, selectedItem2);
			}
			
			/**
			 * This function tells the model to clear all the balls from the canvas.
			 */
			@Override
			public void clearBalls() {
				model.clearBalls();
			}
			
			/**
			 * This function tells the model to paint and update the status of all the balls.
			 */
			@Override 
			public void paintBalls(Graphics g) {
				model.update(g); // see is this is correct or if a paint method is needed
			}

			/**
			 * This function sets the strategy of the switcher balls to whatever is made by
			 * the input's make method.
			 * @param switchFac The new strategy factory whose make method returns the new strategy
			 * for the switcher balls
			 */
			@Override
			public void setSwitcherStrategy(IStrategyFac switchFac) {
				model.setSwitcherStrategy(switchFac);
			}

			/**
			 * This function returns the strategy factory that is making the switcher balls' current strategy.
			 * @return An IStrategyFactory that makes the current switcher balls' strategy.
			 */
			@Override
			public IStrategyFac getSwitcherFac() {
				return model.getSwitcherFac();
			}

			@Override
			public IStrategyFac addPaintFactory(String text) {
				return model.makePaintFactory(text);
			}
		});
	}
	
	/**
	 * This function starts the view and model.
	 */
	public void start() {
		view.start();
		model.start();
	}
}