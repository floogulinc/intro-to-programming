package methodpractice;

import javax.swing.JOptionPane;

public class TestCat {
	
	public static void main(String[] args) {

		Cat paul = new Cat();
		
		paul.meow(); //Hey, I'm a cat. feed me and then go away
		
		paul.myname(JOptionPane.showInputDialog("What is my name?"));
		paul.myage(Integer.parseInt(JOptionPane.showInputDialog("What is my age?")));

	}

}