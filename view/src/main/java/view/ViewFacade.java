package view;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

//import fr.exia.insanevehicles.controller.UserOrder;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {


	private ViewFrame ViewFrame;

	/**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
    }
    
    public void createDisplay(int[][] motionMapDimension, String[] motionMapImages, String[][] motionlessMap, int score, int life, int width, int lenght) {
    	this.ViewFrame = new ViewFrame(width, lenght, motionMapDimension, motionMapImages, motionlessMap, score, life);
    }

    public void showDisplay(int[][] motionMapDimension, String[] motionMapImages, String[][] motionlessMap, int score, int life) {
    	this.ViewFrame.getPanel().setMotionlessMap(motionlessMap);
    	this.ViewFrame.getPanel().setMotionMapDimension(motionMapDimension);
    	this.ViewFrame.getPanel().setMotionMapImages(motionMapImages);
    	this.ViewFrame.getPanel().setScore(score);
    	this.ViewFrame.getPanel().setLife(life);
    	this.ViewFrame.repaint();
    }
    
    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    public ViewFrame getViewFrame() {
    	return ViewFrame;
    }
    
    public void setViewFrame(ViewFrame ViewFrame) {
    	this.ViewFrame = ViewFrame;
    }
    
    /*private static UserOrder keyCodeToUserOrder(final int keyCode) {
        UserOrder userOrder;
        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                userOrder = UserOrder.RIGHT;
                break;
            case KeyEvent.VK_LEFT:
                userOrder = UserOrder.LEFT;
                break;
            case KeyEvent.VK_DOWN:
            	userOrder = UserOrder.DOWN;
            case KeyEvent.VK_UP:
            	userOrder = UserOrder.UP;*/

}
