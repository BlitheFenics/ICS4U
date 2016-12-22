import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * This class demonstrates how to use the MouseMotionListener interface in an Applet
 * Novembeer 28, 2007.
 * @author Sam Scott
 **/
/**
 * This class implements a flashing ball. Feel free to change this, implement a
 * new object, change the animation, etc. <br>
 * 
 * @version November 2015
 * @author Christina Kemp adapted from Sam Scott
 * 
 */
public class FlashingBall extends MovingObject implements MouseMotionListener{

	/**
	 * The radius of the ball.
	 */
	private int radius;
	/**
	 * Counts the frames between flash on/off.
	 */
	private int counter;
	/**
	 * The number of frames to wait before toggling the flash.
	 */
	private int flashSpeed;
	/**
	 * Controls the flash - true if the ball is filled in, false if it is an
	 * outline.
	 */
	private boolean filledIn;

	/**
	 * Calls the superclass constructor, plus sets radius, and flash parameters.
	 * 
	 * @param x
	 *            The x location.
	 * @param y
	 *            The y location.
	 * @param left
	 *            The left edge.
	 * @param right
	 *            The right edge.
	 * @param top
	 *            The top edge.
	 * @param bottom
	 *            The bottom edge.
	 */
	    /**
	     * the position at which the last mouse down event happened
	     **/
	    int x = -1, y = -1;

	    /**
	     * Set to true if it's a mouse dragged event
	     **/
	    boolean filled = false;
	    
	    /**
	     * Activate the mouse listener
	     **/
	    public void init ()
	    {
	 addMouseMotionListener (this);
	    }
	    private void addMouseMotionListener(FlashingBall flashingBall) {
			// TODO Auto-generated method stub
			
		}
		/**
	     * Display basic information from mouse listeners
	     * @param g The graphics context
	     **/
	
	public FlashingBall(double x, double y, int left, int right, int top, int bottom) {
		super(x, y, left + 20, right - 20, top + 20, bottom - 20);
		// numbers above must match the radius
		radius = 80;
		counter = 0;
		flashSpeed = (int) (Math.random() * 5 + 5);
		filledIn = true;
	}

	/**
	 * Controls the animation parameters. (Called once every time the ball
	 * position is updated.)
	 */
	public void animateOneStep() {
		counter++;
		if (counter == flashSpeed) {
			counter = 0;
			if (filledIn)
				filledIn = false;
			else
				filledIn = true;
		}
	}
	public void mouseMoved (MouseEvent e)
    {
 filled = false;
 x = e.getX ();
 y = e.getY ();
 repaint ();
    }


    /**
      * called when mouse is dragged in the window
      * @param e The mouse event
      **/
    public void mouseDragged (MouseEvent e)
    {
 filled = true;
 x = e.getX ();
 y = e.getY ();
 repaint ();
    }
private void repaint() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void draw(Graphics g) {
		int drawX = (int) getX() - radius;
		int drawY = (int) getY() - radius;

		g.setColor(color);
		g.fill3DRect(drawX, drawY, radius * 1, radius * 1, filled);
		
	}
}
