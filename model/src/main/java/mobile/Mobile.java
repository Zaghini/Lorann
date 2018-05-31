package model.Element.mobile;

import model.Element.Element;
import model.Element.Permeability;
import model.Element.Sprite;



public abstract class Mobile extends Element {
	
	public int x;
	public int y;
	
    
    	public int getX() {
    		return this.x;
    		}
        
    	public void setX(int x) {
    		this.x = x;
        	}
        
    	public int getY() {
    	        return this.y;
    	    }
        
    	public void setY(int y) {
    		this.y = y;
    		}
    
	/**
     * Move up.
     */
    public void moveUp() {
        this.setY(this.getY() - 1);
    }

    /**
     * Move left.
     */
    public void moveLeft() {
        this.setX(this.getX() - 1);
    }

    /**
     * Move down.
     */
    public void moveDown() {
        this.setY(this.getY() + 1);
    }

    /**
     * Move right.
     */
    public void moveRight() {
        this.setX(this.getX() + 1);
    }

    
	   Mobile(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }
    
	
}
