package model.Element.Immobile;

public abstract class ImmobileFactory {
	
	private static final Mur_Horizontal Mur_Horizontal = new Mur_Horizontal();
	private static final Mur_Vertical Mur_Vertical = new Mur_Vertical();
	private static final OS OS = new OS();
	private static final Porte_Fermee Porte_Fermee = new Porte_Fermee();
	private static final Bulle Bulle = new Bulle();
	private static final Bourse Bourse = new Bourse();
	private static final Porte_Ouverte Porte_Ouverte = new Porte_Ouverte();
	
	 private static Immobile[]  ImmobileElement  = {
		        Mur_Horizontal,
		        Mur_Vertical,
		        OS,
		        Porte_Fermee,
		        Bulle,
		        Bourse,
		        Porte_Ouverte
		      };
	 
	 
	 public static Immobile createOS() {
		 return OS;
	 }
	 
	 public static Immobile createMur_Horinzontal() {
		return Mur_Horizontal; 
	 }
	 
	 public static Immobile createMur_Vertical() {
		 return Mur_Vertical;
	 }
	 public static Immobile createPorte_Fermee() {
		 return Porte_Fermee;
	 }
	 public static Immobile createBulle() {
		 return Bulle;
	 }
	 public static Immobile createBourse() {
		 return Bourse;
	 }
	 public static Immobile createPorte_Ouverte() {
		 return Porte_Ouverte;
	 }
}
