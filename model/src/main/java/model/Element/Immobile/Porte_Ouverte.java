<<<<<<< HEAD
package model.Element.Immobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class Porte_Ouverte extends Immobile {
	
 private static Sprite Porte_Ouverte = new Sprite('P',"gate_open.png");
 
 	protected Porte_Ouverte(){
 	super(Porte_Ouverte,Permeability.PENETRABLE);
 	}
}
=======
package model.Element.Immobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class Porte_Ouverte extends Immobile {
	
 private static Sprite Porte_Ouverte = new Sprite('P',"gate_open.png");
 
 	Porte_Ouverte(){
 	super(Porte_Ouverte,Permeability.PENETRABLE);
 	}
}
>>>>>>> origin/Petrinio
