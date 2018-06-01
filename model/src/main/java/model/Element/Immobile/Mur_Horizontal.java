<<<<<<< HEAD
package model.Element.Immobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class Mur_Horizontal extends Immobile{
	
	private static final Sprite Mur_Horizontal = new Sprite ('I',"Horizontal_bone.png");
	
	protected Mur_Horizontal(){
		super(Mur_Horizontal,Permeability.BLOCKING);
	}
	

}
=======
package model.Element.Immobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class Mur_Horizontal extends Immobile{
	
	private static final Sprite Mur_Horizontal = new Sprite ('I',"Horizontal_bone.png");
	
	Mur_Horizontal(){
		super(Mur_Horizontal,Permeability.BLOCKING);
	}
	

}
>>>>>>> origin/Petrinio
