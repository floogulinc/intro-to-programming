package ninjaturtles;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		NinjaTurtle n = new NinjaTurtle(4, 10);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter your ninja turtle's name: Mikey, Donny, Raph, or Leo");
		String myTurtle = s.next();
		n.setName(myTurtle);
		System.out.println("your turtle's name is " + n.getName());
		
		if(n.getName().equals("Mikey")) {
			System.out.println("You equip nunchuks on your turtle");
			n.weapon = "Nunchuks";
		} else if(n.getName().equals("Raph")) {
			System.out.println("You equip Psais on your turtle");
			n.weapon = "Psais";
		} else if(n.getName().equals("Donny")) {
			System.out.println("You equip a staff on your turtle");
			n.weapon = "Staff";
		} else if(n.getName().equals("Leo")){
			System.out.println("You equip Swords you will never use on your turtle");
			n.weapon = "Swords";
		}
		
		n.enemy();
		n.kungFuKick();
		n.vanish();
		
		for(int i = 2; i >= 0; i--) {
			System.out.println("Your turtle hides in the shadows waiting to strike");
			if(i == 1) {
				System.out.println("Your turtle strikes with deadly accuracy");
				break;
			}
		}
		
		n.defeatEnemy();
		n.eat("Cheese");
		
	}

}
