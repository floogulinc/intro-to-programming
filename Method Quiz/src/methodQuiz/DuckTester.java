package methodQuiz;

import java.io.IOException;

public class DuckTester {

	public static void main(String[] args) {
		//the main method is what is executed first when the JVM runs the program
		Duck paul = new Duck();
		paul.size = 30;
		paul.age = 2;
		
		paul.duckQuack(); //Quack Quack, I'm a duck and my age is 2 years, and I am 30 feet tall
		
		paul.duckRun(25); //I run at a speed of 25 mph

		long a = 1000;
		char x = '$';
		float y = 13.5f;
	}

}
