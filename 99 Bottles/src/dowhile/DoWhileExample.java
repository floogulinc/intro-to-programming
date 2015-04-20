package dowhile;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cupcake = 10;
		
		while(cupcake > 10) {
			System.out.println("you ate a cupcake (" + cupcake + ")");
			cupcake -= 2;
		}
		
		int cupcake2 = 10;
		
		do{
			System.out.println("you ate a cupcake2 (" + cupcake2 + ")");
			cupcake2 -= 2;
		} while(cupcake2 > 10);
		//do while loop runs at least once regardless of the condition being true/false  
		
	}

}
