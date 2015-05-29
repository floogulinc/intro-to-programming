package ninjaturtles;

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

}
