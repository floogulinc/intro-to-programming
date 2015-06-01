package ninjaturtles;

import utils.TurtleNames;

public class NinjaTurtle extends Turtle implements Ninja {
	
	public NinjaTurtle(int legs, int shellsize) {
		this.legs = legs;
		this.shellsize = shellsize;
	}
	
	public String weapon;

	@Override
	public void kungFuKick() {
		System.out.println("Your turtle unleashes a powerful kick");
	}

	@Override
	public void vanish() {
		System.out.println("Your turtle vanishes like a ninja into thin air");
	}

	@Override
	public String enemy() {
		return "Your enemy is the Shredder";
	}
	
	@Override
	public void eat() {
		System.out.println("Your turtle eats a whole pizza");
	}
	
	public void eat(String s) {
		System.out.println("Your turtle eats a " + s + " pizza in victory");
	}
	
	public void defeatEnemy() {
		System.out.println("You used your " + weapon + " to defeat the Shredder");
	}

	/* (non-Javadoc)
	 * @see ninjaturtles.Turtle#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		if(name.equalsIgnoreCase("Mikey")) super.setName(TurtleNames.MIKEY);
		else if(name.equalsIgnoreCase("Donny")) super.setName(TurtleNames.DONNY);
		else if(name.equalsIgnoreCase("Raph")) super.setName(TurtleNames.RAPH);
		else if(name.equalsIgnoreCase("Leo")) super.setName(TurtleNames.LEO);
		else {
			System.out.println("Please enter " + TurtleNames.LIST);
			System.out.println("Exiting Application");
			System.exit(0);
		}
	}
	
	

}
