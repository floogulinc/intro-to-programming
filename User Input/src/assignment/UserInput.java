package assignment;

//import Scanner class
import java.util.Scanner;

public class UserInput {
	
	//new method to ask the user things and return what was responded
	public static String askfor(Scanner ui, String ask) {
		//prints question
		System.out.println(ask);
		//gets reply
		return ui.next();
	}

	//main method, what runs when program starts
	public static void main(String[] args) {
		//assigns a new Scanner to user_input
		Scanner user_input = new Scanner(System.in);
		
		//prints the final sentence, using askfor to ask the user questions, 
		//their responses are inserted into the sentence.
		System.out.println(askfor(user_input, "What is your name? ") +
				" used their superhuman power of " +
				askfor(user_input, "What is your one superpower? ") +
				" to defeat their arch nemesis " + 
				askfor(user_input, "Who is your arch nemesis? "));
	}

}
