
package model.Element.Immobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class Mur_Vertical extends Immobile {
	
	private static final Sprite Mur_Vertical = new Sprite('-',"vertical_bone.png");
	
	protected Mur_Vertical(){
		super(Mur_Vertical,Permeability.BLOCKING);
	}
	
	

}
