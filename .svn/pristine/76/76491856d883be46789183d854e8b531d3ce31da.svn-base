/**
 * This is the view package, which is separate from the model and controller.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;

/**
 * This is the BallWorldView class, which has the frame on which our BallWorld is displayed.
 * @author sn32, kyl3, lka2, swong
 */
public class BallWorldView<TDropListItem> extends JFrame {
	/**
	 * This is a private variable that gives the class an ID to serialize and deserialize.
	 */
	private static final long serialVersionUID = -7114823923004621639L;
	
	/**
	 * This is the contentPane which is part of the frame.
	 */
	private JPanel contentPane;
	
	/**
	 * This is the control panel of the JFrame.
	 */
	private final JPanel pnlControl = new JPanel();
	
	/**
	 * This is the text field for users to type in.
	 */
	private final JTextField tfClassname = new JTextField();
	
	/**
	 * This button clears the balls on the canvas.
	 */
	private final JButton btnClearBalls = new JButton("Clear balls");
	
	/**
	 * This is the view to model adapter, that ensures decoupling of the model and view.
	 */
	private IView2ModelAdapter<TDropListItem> adapter;
	
	/**
	 * This is the canvas where all the balls will be drawn.
	 */
	private final JPanel pnlCanvas = new JPanel() {
		/**
		 * This is a private variable that gives the class an ID to serialize and deserialize.
		 */
		private static final long serialVersionUID = 8303517520311377718L;

		/**
		 * Overridden paintComponent method to paint a shape in the panel.
		 * @param g The Graphics object to paint on.
		 */
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // Do everything normally done first, e.g. clear the screen.
			adapter.paintBalls(g);
		}
	};
	
	/**
	 * This is a button that lets you add the text field input as a strategy factory to the JComboBox.
	 */
	private final JButton btnAddToList = new JButton("Add to list");
	
	/**
	 * This button lets you combine strategies.
	 */
	private final JButton btnCombine = new JButton("Combine");
	
	/**
	 * This lets you makes a ball with the selected strategy.
	 */
	private final JButton btnMakeSelectedBall = new JButton("Make selected ball");
	
	/**
	 * This lets you make a switcher ball.
	 */
	private final JButton btnMakeSwitcher = new JButton("Make switcher");
	
	/**
	 * This lets you switch the switcher balls to the current strategy factory's make on the top combo box.
	 */
	private final JButton btnSwitch = new JButton("Switch");
	
	/**
	 * This is a drop down list that shows the possible strategies that can be made, on the top.
	 */
	private JComboBox<TDropListItem> comBoxTop = new JComboBox<TDropListItem>();
	
	/**
	 * This is a drop down list that shows the possible strategies that can be made, on the bottom.
	 */
	private JComboBox<TDropListItem> comBoxBottom = new JComboBox<TDropListItem>();
	
	/**
	 * This is the panel that holds the components that modify the lists of the drop down boxes.
	 */
	private final JPanel pnlChangeList = new JPanel();
	
	/**
	 * This is the panel that hold the components that use information in the drop down boxes, and manipulate them.
	 */
	private final JPanel pnlDropDowns = new JPanel();
	
	/**
	 * This is a panel that holds the components for making switchers and switching them.
	 */
	private final JPanel pnlSwitching = new JPanel();
	
	/**
	 * This is a panel that holds the components necessary for painting.
	 */
	private final JPanel pnlPaintStrats = new JPanel();
	
	/**
	 * This is a button that adds the text field to the paint strategy factories drop down.
	 */
	private final JButton btnAddPaintStrat = new JButton("Add");
	
	/**
	 * This is a text field where you can input paint strategies.
	 */
	private final JTextField txtPaintStrat = new JTextField();
	
	/**
	 * This is a drop down that holds the paint strategy factories.
	 */
	private final JComboBox<TDropListItem> comBoxStrats = new JComboBox<TDropListItem>();
	
	/**
	 * This gets the canvas of the frame.
	 * @return JPanel which is the canvas
	 */
	public JPanel getPanel() {
		return pnlCanvas;
	}
		
	/**
	 * Create the frame
	 * @param adapter An IView2ModelAdapter 
	 */
	public BallWorldView(IView2ModelAdapter<TDropListItem> adapter) {
		txtPaintStrat.setToolTipText("This is the text field where you can add paint strategies.");
		pnlPaintStrats.setToolTipText("This is the panel that holds the components that let you add paint strategies and select them.");
		pnlPaintStrats.add(txtPaintStrat);
		txtPaintStrat.setColumns(10);
		this.adapter = adapter;
		initGUI();
	}
	
	/**
	 * Update the view by repainting
	 */
	public void updateView() {
		repaint();
	}
	
	/**
	 * This function returns the canvas panel.
	 * @return JPanel which is the canvas
	 */
	public Container getCanvas() {
		return getPanel();
	}
	
	/**
	 * This private function initializes the GUI.
	 */
	private void initGUI() {
		setTitle("BallWorld");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("This is the content of the frame.");
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		pnlControl.setBackground(Color.DARK_GRAY);
		pnlControl.setToolTipText("This is the control panel that lets you create balls and clear them.");
		
		contentPane.add(pnlControl, BorderLayout.NORTH);
		pnlControl.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		pnlChangeList.setToolTipText("This panel is where you can add the type of ball you want to make to the drop down lists.");
		
		pnlControl.add(pnlChangeList);
		pnlChangeList.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlChangeList.add(tfClassname);
		tfClassname.setToolTipText("The type of the ball you want to make.");
		
		tfClassname.setColumns(10);
		btnAddToList.setToolTipText("This button adds the strategy type in the text field to the drop down boxes.");
		pnlChangeList.add(btnAddToList);
		btnAddToList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfClassname.getText().equals("")) {
					return;
				}
				
				TDropListItem stratFac = adapter.addStrategy(tfClassname.getText());

                comBoxTop.insertItemAt(stratFac, 0);
                comBoxBottom.insertItemAt(stratFac, 0);
			}
		});
		pnlDropDowns.setToolTipText("This panel is for the drop down boxes, and buttons to make selected balls and combine strategies.");
		
		pnlControl.add(pnlDropDowns);
		pnlDropDowns.setLayout(new GridLayout(0, 1, 0, 0));
		btnMakeSelectedBall.setToolTipText("This button makes a ball with the update strategy of the factory that's selected on the top drop down box.");
		pnlDropDowns.add(btnMakeSelectedBall);
		comBoxTop.setToolTipText("This is the drop down list on the top.");
		pnlDropDowns.add(comBoxTop);
		comBoxBottom.setToolTipText("This is the drop down list on the bottom.");
		pnlDropDowns.add(comBoxBottom);
		btnCombine.setToolTipText("This button combines the two strategy factories in the combo boxes.");
		pnlDropDowns.add(btnCombine);
		btnCombine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TDropListItem top = comBoxTop.getItemAt(comBoxTop.getSelectedIndex());
				TDropListItem bottom = comBoxBottom.getItemAt(comBoxBottom.getSelectedIndex());
				
				if (top == null || bottom == null) {
					return;
				}
				
				TDropListItem combo = adapter.combineStrategies(top, bottom);
				comBoxTop.addItem(combo);
				comBoxBottom.addItem(combo);
			}
		});
		btnMakeSelectedBall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TDropListItem selected = comBoxTop.getItemAt(comBoxTop.getSelectedIndex());
				TDropListItem paintFac = comBoxStrats.getItemAt(comBoxStrats.getSelectedIndex());
				
				if (selected == null || paintFac == null) {
					return;
				}
				
				adapter.makeBall(selected, paintFac);
			}
		});
		pnlSwitching.setToolTipText("This panel is for the buttons related to making switcher balls and switching their strategies.");
		
		pnlControl.add(pnlSwitching);
		pnlSwitching.setLayout(new GridLayout(0, 1, 0, 0));
		btnMakeSwitcher.setToolTipText("Click this item to make a switcher ball.");
		pnlSwitching.add(btnMakeSwitcher);
		btnSwitch.setToolTipText("Click this button to switch the switcher balls to the selected item in the top combo box.");
		pnlSwitching.add(btnSwitch);
		
		btnSwitch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TDropListItem switchFac = comBoxTop.getItemAt(comBoxTop.getSelectedIndex());
				
				if (switchFac == null) {
					return;
				}
				
				adapter.setSwitcherStrategy(switchFac);
			}
		});
		
		btnMakeSwitcher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TDropListItem switcherStrat = adapter.getSwitcherFac();
				TDropListItem paintStrat = comBoxStrats.getItemAt(comBoxStrats.getSelectedIndex());
				
				if (paintStrat == null) {
					return;
				}
				
				adapter.makeBall(switcherStrat, paintStrat);
			}
		});
		btnClearBalls.setToolTipText("Click this to clear the balls on the canvas.");
		btnClearBalls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adapter.clearBalls();
			}
		});
		
		pnlControl.add(btnClearBalls);
		
		pnlControl.add(pnlPaintStrats);
		pnlPaintStrats.setLayout(new GridLayout(0, 1, 0, 0));
		btnAddPaintStrat.setToolTipText("This is the button that lets you add paint strategies to the combo box below.");
		btnAddPaintStrat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtPaintStrat.getText().equals("")) {
					return;
				}
				
				TDropListItem paintFac = adapter.addPaintFactory(txtPaintStrat.getText());
                comBoxStrats.insertItemAt(paintFac, 0);
			}
		});
		
		
		pnlPaintStrats.add(btnAddPaintStrat);
		comBoxStrats.setToolTipText("The is the combo box for the paint strategies that can be implemented.");
		
		pnlPaintStrats.add(comBoxStrats);
		pnlCanvas.setBackground(Color.LIGHT_GRAY);
		pnlCanvas.setToolTipText("This is the canvas where the balls move, and stay in.");
		
		contentPane.add(pnlCanvas, BorderLayout.CENTER);
	}
	
	/**
	 * This function makes the frame visible after initializing it.
	 */
	public void start() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
}