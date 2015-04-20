package methodpractice;

import javax.swing.JOptionPane;

public class TestCat {
	
	public static void main(String[] args) {

		Cat paul = new Cat();
		
		paul.meow();
		
		paul.myname(JOptionPane.showInputDialog("What is my name?"));
		paul.myage(Integer.parseInt(JOptionPane.showInputDialog("What is my age?")));

	}

}