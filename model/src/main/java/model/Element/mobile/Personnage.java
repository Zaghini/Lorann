package model.Element.mobile;

import model.Element.Element;
import model.Element.Permeability;
import model.Element.Sprite;

public class Personnage {

	    /** The alive. */
	    private Boolean alive = true;

	    /** The road. */
	    private Map map;

	    /**
	     * Checks if is alive.
	     *
	     * @return the alive
	     */
	    public Boolean isAlive() {
	        return this.alive;
	    }

	    public void die() {
	        this.alive = false;
	    }

	    public Map getMap() {
	        return this.map;
	    }
	    
	    public void setMap(final Map map) {
	        this.map = map;
	    }
}
}


