package testreview2;

import java.util.Scanner;

public class BonusCalculator {
	
	public static String askfor(Scanner ui, String ask) {
		System.out.println(ask);
		return ui.next();
	}

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		boolean teacher = (askfor(user_input, "Are you a teacher or student? "
				+ "(enter \"teacher\" or \"student\")").equals("teacher") ? true : false);
		
		double income = (double) Integer.parseInt(askfor(user_input, "What is your income?"));
		double result = income * 0.1;
		
		if(teacher && (income > 50000)) System.out.println("you are doing good for a teacher");
		else if(teacher || (income > 50000)) System.out.println("you are either a poor teacher or a rich other");
		else if(!teacher && (income < 50000)) System.out.println("you are a poor student");
		else if(!teacher || (income < 50000)) System.out.println("you are either a rich student or a poor person");

	}

}
