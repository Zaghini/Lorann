package model.Element.mobile;

import model.Element.Element;
import model.Element.Permeability;
import model.Element.Sprite;

public abstract class Personnage extends Mobile {

	    Personnage(int x, int y, Sprite sprite, Permeability permeability) {
		super(x, y, sprite, permeability);
		// TODO Auto-generated constructor stub
	}
	    Personnage(final Sprite sprite, final Permeability permeability) {
	        super(sprite, permeability);
	    }

		/** The alive. */
	    protected Boolean alive = true;

	    /** The road. */
	    

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

}



