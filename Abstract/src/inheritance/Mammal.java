package inheritance;

public class Mammal extends Animal {
	
	String hairtype;

	@Override
	public void eat() {
		System.out.println("The Mammal eats");
	}
	
	@Override
	public void shed() {
		System.out.println("The Mammal sheds");
	}

	//Need to override the inherited abstract method
	@Override
	public void makeNoise() {
		System.out.println("Mammal Noise");
	}
}
