package methodpractice;

import javax.swing.JOptionPane;

public class Cat {
	
	public void meow() {
		
		System.out.println("Hey, I'm a cat. feed me and then go away");
		JOptionPane.showMessageDialog(null, "Hey, I'm a cat. feed me and then go away");
		
	}
	
	public void myname(String name) {
		System.out.println("Hello, my name is " + name);
		JOptionPane.showMessageDialog(null, "Hello, my name is " + name);
	}
	
	public void myage(int age) {
		System.out.println("Hey Dudes. I am " + age + " years old in cat years");
		JOptionPane.showMessageDialog(null, "Hey Dudes. I am " + age + " years old in cat years");
	}

}
