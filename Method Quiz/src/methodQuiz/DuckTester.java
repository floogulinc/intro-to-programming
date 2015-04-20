package methodQuiz;

import java.io.IOException;

public class DuckTester {

	public static void main(String[] args) {
		//the main method is what is executed first when the JVM runs the program
		Duck paul = new Duck();
		paul.size = 30;
		paul.age = 2;
		
		paul.duckQuack();
		
		paul.duckRun(25);
	
		/*
		try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://en.wikipedia.org/wiki/Duck"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		


		long a = 1000;
		char x = '$';
		float y = 13.5f;
	}

}
