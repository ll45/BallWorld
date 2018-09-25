/**
 * This is the model package, that has the model, ball, movement strategies, 
 * paint strategies, strategy factories, and adapter.
 */
package model;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;

/**
 * This class defines a paint strategy for an image that extends APaintStrategy.
 * @author sn32, ll45
 */
public class ImagePaintStrategy extends APaintStrategy {
	/**
	 * This is a private variable for the scale factor.
	 */
	private double scaleFactor = 1.0;
	
	/**
	 * This is private variable for the fill factor.
	 */
	private double fillFactor = 1.0;
	
	/**
	 * This is a variable for the local Affine Transform.
	 */
	private AffineTransform localAT = new AffineTransform();
	
	/**
	 * This is a variable for the temporary Affine Transform.
	 */
	private AffineTransform tempAT = new AffineTransform();
	
	/**
	 * This is a private variable for the filename to load.
	 */
	private String filename;
	
	/**
	 * This is the image loaded by the filename being loaded.
	 */
	private Image image;
	
	/**
	 * This is the observer to be notified when the image updates.
	 */
	private Container imageObs;
	
	/**
	 * This is a constructor for the Image Paint Strategy that doesn't take an Affine Transform.
	 * @param filename String that is the path to the image file to load
	 * @param fillFactor A double that is the fill factor
	 */
	public ImagePaintStrategy(String filename, double fillFactor) {
		super (new AffineTransform());
		this.fillFactor = fillFactor;
		this.setFilename(filename);
				
		try {
			image =  Toolkit.getDefaultToolkit().getImage(filename);	
			
		} catch (Exception e) {
			System.out.println("failed");
		}
	}
	
	/**
	 * This is a constructor for Image Paint Strategy that takes an Affine Transform.
	 * @param filename String that is the path to the image file to load.
	 * @param fillFactor A double that is the fill factor
	 * @param at An Affine Transform.
	 */
	public ImagePaintStrategy(String filename, double fillFactor, AffineTransform at) {
		super(at);
		this.fillFactor = fillFactor;
		this.setFilename(filename);
	}
	
	/**
	 * This function initializes the ball.
	 */
	public void init(Ball ball) {
		imageObs = ball.getCon();
		MediaTracker mt = new MediaTracker(ball.getCon());
		mt.addImage(image, 1);
		try {
			mt.waitForAll();
		} catch(Exception e){
			System.out.println("ImagePaintStrategy.init(): Error waiting for image.  Exception = "+e);
		}
		scaleFactor = 2.0/(fillFactor*(image.getWidth(imageObs)+image.getHeight(imageObs))/2.0); // this line is described below
	}

	/**
	 * This function is a secondary paint operation that is the last step of the above
	 * paint method, which does not calculate its own affine transform, but instead, uses a
	 * supplied affine transform. 
	 */
	@Override
	public void paintXfrm(Graphics g, Ball ball, AffineTransform at) {
		localAT.setToScale(scaleFactor, scaleFactor);
		localAT.translate(-image.getWidth(imageObs)/2.0, -image.getHeight(imageObs)/2.0);
		localAT.preConcatenate(at);
		((Graphics2D)g).drawImage(image, localAT, imageObs); 
	}

	/**
	 * This function returns the filename.
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * This function sets the filename.
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
	 * This function returns the temp AT.
	 * @return the tempAT
	 */
	public AffineTransform getTempAT() {
		return tempAT;
	}

	/**
	 * This function sets the temp AT.
	 * @param tempAT the tempAT to set
	 */
	public void setTempAT(AffineTransform tempAT) {
		this.tempAT = tempAT;
	}	
}
