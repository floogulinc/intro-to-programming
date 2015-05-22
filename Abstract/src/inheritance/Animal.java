package inheritance;

public abstract class Animal {
	
	int legs;
	
	public abstract void makeNoise();
	
	public void eat() {
		System.out.println("The Animal eats");
	}

	public void shed() {
		System.out.println("The Animal sheds");
	}
}
