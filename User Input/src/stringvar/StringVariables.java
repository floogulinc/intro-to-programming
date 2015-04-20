package stringvar;

import java.util.Scanner;

public class StringVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner user_input = new Scanner(System.in);
		
		String firstname;
		System.out.println("Enter your first name: ");
		firstname = user_input.next();
		
		String familyname;
		System.out.println("Enter your family name: ");
		familyname = user_input.next();
		
		String fullname = firstname + " " + familyname;
		System.out.println("You are " + fullname);
		

	}

}
