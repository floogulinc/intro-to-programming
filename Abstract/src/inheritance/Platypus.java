package inheritance;

public class Platypus extends FreakOfNature {
	
	@Override
	public void eat() {
		System.out.println("The Platypus eats");
	}
	
	//Overloading
	public void eat(char c){
		System.out.println("The Platypus eats (char)");
	}
	public void eat(int i){
		System.out.println("The Platypus eats (int)");
	}
	public void eat(int i, double d){
		System.out.println("The Platypus eats (int, double)");
	}
	public void eat(double d, int i){
		System.out.println("The Platypus eats (double, int)");
	}
	public void eat(String s){
		System.out.println("The Platypus eats (String)");
	}
	
	
	public void sing() {
		System.out.println("The Platypus sings");
	}

}
