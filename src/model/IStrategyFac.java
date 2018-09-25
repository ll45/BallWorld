/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import util.Dispatcher;

/**
 * This interface defines the functions we want IStrategyFac to have.
 * @author sn32, lka2
 */
public interface IStrategyFac {
	/**
	 * This function allows IStrategyFac to make an IUpdateStrategy.
	 * @return An IUpdateStrategy
	 */
	public IUpdateStrategy make();
	
	/**
	 * This function allows IStrategyFac to make an IPaintStrategy.
	 * @return An IPaintStrategy
	 */
	public IPaintStrategy makePaint();
	
	/**
     * A factory for a beeping error strategy that beeps the speaker every 25 updates.
     * Either use the _errorStrategyFac variable directly if you need a factory that
     * makes an error strategy, or call _errorStrategyFac.make() to create an instance
     * of a beeping error strategy.
     */
	public IStrategyFac _errorStrategyFac = new IStrategyFac(){
        /**
         * Make the beeping error strategy
         * @return  An instance of a beeping error strategy
         */
		@Override
		public IUpdateStrategy make() {
            return new IUpdateStrategy() {
                private int count = 0; // update counter
                
                /**
                 * Beep the speaker every 25 updates
                 */
				@Override
				public void updateState(Ball ball, Dispatcher dispatcher) {
					if(25 < count++){
                        java.awt.Toolkit.getDefaultToolkit().beep(); 
                        count = 0;
                    }
				}
            };
        }
		
		/**
		 * Make the default paint strategy.
		 */
		@Override
		public IPaintStrategy makePaint() {
			return new BallPaintStrategy();
		}
    };
    
    /**
     * This factory creates a new Switcher Strategy.
     */
    public IStrategyFac switcherStrat = new IStrategyFac() {
    		/**
    		 * This function makes the switcher strategy.
    		 */
		@Override
		public IUpdateStrategy make() {
			return new SwitcherStrategy();
		}

			/**
			 * Make the default paint strategy.
			 */
			@Override
			public IPaintStrategy makePaint() {
				return new BallPaintStrategy();
			}
	};
}