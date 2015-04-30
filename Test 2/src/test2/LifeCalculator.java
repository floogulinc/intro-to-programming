package test2;

import java.util.Scanner;

public class LifeCalculator {
	
	public static String askfor(Scanner ui, String ask) {
		System.out.println(ask);
		return ui.next();
	}

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		String c = askfor(user_input, "Are you a knight or rogue? "
				+ "(enter \"knight\" or \"rogue\")");
		
		double hp = Integer.parseInt(askfor(user_input, "What is your age?")) * 4;
		
		if(c.equals("knight") && (hp > 100)) System.out.println("You are a tank");
		if(c.equals("knight") || (hp > 100)) System.out.println("You can fulfill the tank role");
		if(c.equals("rogue") && (hp < 100)) System.out.println("You are an glass cannon");
		if(c.equals("rogue") || (hp < 100)) System.out.println("You cannot take much damage, avoid at all costs");
	}

}
