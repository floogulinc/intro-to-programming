package helloworld;

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {

		// dumb hello world print
		System.out.print("Hello World");
		
		String age = JOptionPane.showInputDialog("Age?");

		//more fun stuff
		JOptionPane.showMessageDialog(null, "My age is " + age + " years old");

		
	}

}
