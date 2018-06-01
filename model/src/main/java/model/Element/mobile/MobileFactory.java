package model.Element.mobile;

import model.Element.Immobile.Immobile;

public abstract class MobileFactory {

	private static final Demon1 Demon1 = new Demon1();
	private static final Demon2 Demon2 = new Demon2();
	private static final Demon3 Demon3 = new Demon3();
	private static final Demon4 Demon4 = new Demon4();
	private static final Lorann Lorann = new Lorann();
	private static final Spell Spell = new Spell();
	
	 private static Mobile[]   MobileElement  = {
		        Demon1,
		        Demon2,
		        Demon3,
		        Demon4,
		        Lorann,
		        Spell,
		      };
	
	 
	 public static Mobile createDemon1() {
		return Demon1; 
	 }
	 
	 public static Mobile createDemon2() {
		 return Demon2;
	 }
	 public static Mobile createDemon3() {
		 return Demon3;
	 }
	 public static Mobile createDemon4() {
		 return Demon4;
	 }
	 public static Mobile createLorann() {
		 return Lorann;
	 }
	 public static Mobile createSpell() {
		 return Spell;
	 }
}
