package weekthreequiz;

public class IfElseExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		short b = 15;
		float c = 5.5f;
		double d = 10.505;
		boolean bool = true;
		char character = 'J';
		
		int x = a + b;
		double y = b / d;
		
		if(bool == true){
			System.out.println("Turns out it was all true");
		}
		
		if(x < 10) {
			System.out.println("x is a pretty small number guy");
		} else if (x == 10){
			System.out.println("x is equal to 10 buddy");
		} else {
			System.out.println("Woah, slow down friend, x is pretty big");
		}

	}

}